
import commandpattern.*;
import commandpattern.ceilingfan.*;
import commandpattern.light.Light;
import commandpattern.light.LightOffCommand;
import commandpattern.light.LightOnCommand;
import commandpattern.stereo.Stereo;
import commandpattern.stereo.StereoOffCommand;
import commandpattern.stereo.StereoWithCDCommand;

import java.io.IOException;

import java.util.logging.*;


public class Main {
    private static Logger outputmsj = Logger.getLogger(Main.class.getName());

    /**
     * THE COMMAND PATTERN ENCAPSULATES A REQUEST AS AN OBJECT, THEREBY LETTING
     * YOU PARAMETERIZE OTHER OBJECTS WITH DIFFERENT REQUESTS, QUEUE OR LONG REQUEST,
     * AND SUPPORT UNDOABLE OPERATIONS
     * @param args
     * @throws IOException
     */

    public static void main(String[] args)throws IOException {
        System.out.println("*******************WELCOME TO THE COMMAND PATTERN*******************************");
        Invoker invoker = new Invoker();
        Light light= new Light();
        Command lightOnCommand= new LightOnCommand(light);
        CeilingFan ceilingFan= new CeilingFan("Guadalajara, jal");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingOffCommand ceilingOffCommand= new CeilingOffCommand(ceilingFan);
//        invoker.setCommand(lightOnCommand);
//        invoker.execute();
//        try {
//            System.out.println("wait 2 sec. until light gets off");
//            Thread.sleep(2000);
//        }catch (InterruptedException e){
//        }
        Command lightOnOffCommand = new LightOffCommand(light);
//        invoker.setCommand(lightOnOffCommand);
//        invoker.execute();

        //instatiating stereo class
        Stereo stereo = new Stereo();
        Command stereowithCDCommand=new StereoWithCDCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,lightOnCommand
                ,lightOnOffCommand);
        remoteControl.setCommand(1, stereowithCDCommand,stereoOffCommand);
        remoteControl.setCommand(2,ceilingFanHighCommand,ceilingOffCommand);
        remoteControl.setCommand(3, ceilingFanMediumCommand,ceilingOffCommand);

        Command[] onCommands= new Command[]{lightOnCommand,ceilingFanHighCommand,ceilingFanMediumCommand,stereowithCDCommand};
        Command[] offCommands = new Command[]{lightOnOffCommand,ceilingOffCommand,stereoOffCommand};
        Command macroOnCommand = new MacroCommand(onCommands);
        Command macroOffCommand = new MacroCommand(offCommands);
        remoteControl.setCommand(4,macroOnCommand,macroOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        System.out.println(remoteControl);
        remoteControl.onUndoButtonPressed();
        remoteControl.onButtonWasPushed(3);
        remoteControl.onUndoButtonPressed();
        System.out.println(remoteControl);
        remoteControl.offButtonWasPushed(3);
        System.out.println("\n************ pushing macro on **********");
        remoteControl.onButtonWasPushed(4);
        System.out.println("************ pushing macro off **********");

        remoteControl.offButtonWasPushed(4);
        System.out.println("************ rolling back macro **********");
        remoteControl.onUndoButtonPressed();

    }
}
