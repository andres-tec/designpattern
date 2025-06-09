//package gumballmachinereport;//package gumballmachine;

import java.io.Serializable;

public interface State extends Serializable {
    public void insertQuater();
    public void ejectQuater();
    public void turnCrank();
    public void dispense();

}
