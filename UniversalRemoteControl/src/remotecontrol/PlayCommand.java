package remotecontrol;

public class PlayCommand implements ICommand{

        @Override
        public void execute() {
            System.out.println("play");
        }

    }

