package controllingaccessproxy.gumballinterfaces.gumballmachine.simpledemo.clientside;//package simpledemo.clientside;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {

    public String sayHello()throws RemoteException;

}
