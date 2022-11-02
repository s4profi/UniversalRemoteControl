package remotecontrol;

public class NextPreviousCommand implements ICommand {

    @Override
    public void execute() {
        System.out.println("next");
    }

    @Override
    public void undo() {
        System.out.println("previous");
    }
}
