package gumballmachine;

import gumballinterfaces.GumballMachineRemote;

import java.io.IOException;
import java.rmi.Naming;
import java.util.logging.*;


public class GumballMachineTestDrive {
    private static Logger outputmsj = Logger.getLogger(GumballMachineTestDrive.class.getName());

    /**
     * 
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) {
        args = new String[]{"austin.mightygumball.com", "100"};
        System.out.println("*******************WELCOME TO THE PROXY PATTERN *******************************");
        GumballMachineRemote gumballMachine = null;
        int count;


        if(args.length<2){
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try{
        count = Integer.parseInt(args[1]);
        gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//"+args[0]+"/gumballmachine",gumballMachine);
//        gumballMachine.setState("Waiting for the quarter");
//        GumballMonitor monitor = new GumballMonitor(gumballMachine);
//        monitor.report();

        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
