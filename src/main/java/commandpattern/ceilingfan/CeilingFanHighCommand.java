package commandpattern.ceilingfan;

import commandpattern.Command;

public class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;
    private int prevState;
    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevState =ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (prevState==CeilingFan.HIGH){
            ceilingFan.high();
        }else if (prevState ==CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if (prevState ==CeilingFan.LOW){
            ceilingFan.low();
        }else if(prevState ==CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
