package gumballmachine;

import gumballinterfaces.GumballMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private static final long serialVersionUID = 2L;
    private int count;
    private String location;
    private State state;

    public GumballMachine(String location , int count)throws RemoteException {
        this.location = location;
        this.count = count;
    }

    public String getLocation(){
        return this.location;
    }

    public int getCount() {
        return this.count;
    }

    public State getState() {
        return state;
    }
}
