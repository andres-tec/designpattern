package commandpattern.ceilingfan;

import commandpattern.Command;

public class CeilingOffCommand implements Command {
    private CeilingFan ceilingFan;
    private int prevState;
    public CeilingOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevState =ceilingFan.getSpeed();
        ceilingFan.off();
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
