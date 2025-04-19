package commandpattern.light;

import commandpattern.Command;

public class LightOnCommand implements Command {
    Light lightOnAction;
    public LightOnCommand(Light lightOn){
        this.lightOnAction=lightOn;
    }

    @Override
    public void execute() {
        this.lightOnAction.lightOn();
    }

    @Override
    public void undo() {
        lightOnAction.lightOff();
    }
}
