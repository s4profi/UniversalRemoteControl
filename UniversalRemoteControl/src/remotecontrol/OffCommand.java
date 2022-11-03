package remotecontrol;

public class OffCommand implements ICommand{
    public void execute() {
        System.out.println("off");
    }
}
