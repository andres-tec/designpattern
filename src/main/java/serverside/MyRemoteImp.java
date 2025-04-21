package serverside;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImp extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID =1L;

    public static void main(String[] args){
       try{
           MyRemote service = new MyRemoteImp();
           Naming.rebind("RemoteHello", service);
       }catch (Exception e){
           e.printStackTrace();
       }
    }
   public MyRemoteImp()throws RemoteException{
   }

    public String sayHello(){
        return "Server says, Hey!";
    }

}
