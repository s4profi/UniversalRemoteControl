package remotecontrol;

public class OnOffCommand implements ICommand{

    @Override
    public void execute() {
        System.out.println("on");
    }

    @Override
    public void undo() {
        System.out.println("off");
    }


}
