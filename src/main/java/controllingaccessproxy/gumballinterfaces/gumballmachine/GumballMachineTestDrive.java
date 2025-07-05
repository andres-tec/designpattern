package controllingaccessproxy.gumballinterfaces.gumballmachine;//package gumballmachine;

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
//        args = new String[]{"austin.mightygumball.com", "100"};
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
            System.out.println("args " + args[0] +" " + args[1]);
            Naming.rebind("//"+ args[0] + "/controllingaccessproxy/gumballinterfaces/gumballmachine",gumballMachine);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
