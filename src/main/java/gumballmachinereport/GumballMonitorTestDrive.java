import java.rmi.Naming;

public class GumballMonitorTestDrive {

    public static void main(String[] args){
        String[] location = {"rmi://localhost/gumballmachine"};
//        "rmi://santafe.mightygumball.com/gumballmachine"
//                ,"rmi://boulder.mightygumball.com/gumballmachine"
        GumballMonitor[] monitor = new GumballMonitor[location.length];
        for (int i=0; i<location.length; i++){
            try{
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i]= new GumballMonitor(machine);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

        for (int i = 0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
