package commandpattern;

public class Invoker {
    Command command;

    public Invoker(){
    }
    public void setCommand(Command receiver ){
        this.command=receiver;
    }
    public void execute(){
        this.command.execute();
    }
}
