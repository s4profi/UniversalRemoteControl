package remotecontrol;

public class StopCommand implements ICommand{
    public void execute() {
        System.out.println("stop");
    }

}
