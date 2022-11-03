package remotecontrol;

public class OnCommand implements ICommand{

    @Override
    public void execute() {
        System.out.println("on");
    }

}
