package controllingaccessproxy.gumballinterfaces.gumballmachine;//package gumballmachine;


public class NoQuarterState implements State{
    private static final long serialVersionUID=2L;
    transient GumballMachine gumballMachine;

    @Override
    public void insertQuater() {
        System.out.println("Waiting to insert Quater...");
        gumballMachine.setState(this);
    }

    @Override
    public void ejectQuater() {
        System.out.println("ejecting Quater...");
    }

    @Override
    public void turnCrank() {
        System.out.println("turning Crank...");
    }

    @Override
    public void dispense() {
        System.out.println("dispensing...");
    }
}
