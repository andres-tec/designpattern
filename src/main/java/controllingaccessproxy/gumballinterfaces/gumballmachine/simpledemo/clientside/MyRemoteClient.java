package controllingaccessproxy.gumballinterfaces.gumballmachine.simpledemo.clientside;//package simpledemo.clientside;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args){
        new MyRemoteClient().go();
    }

    public void go(){
        try{
            controllingaccessproxy.gumballinterfaces.gumballmachine.simpledemo.clientside.MyRemote service = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
