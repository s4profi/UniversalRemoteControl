package remotecontrol;

public class NextCommand implements ICommand {

    @Override
    public void execute() {
        System.out.println("next");
    }

}
