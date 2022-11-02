package remotecontrol;

public class PlayStopCommand implements ICommand{

        @Override
        public void execute() {
            System.out.println("play");
        }

        @Override
        public void undo() {
            System.out.println("pause");
        }


    }

