
import remotecontrol.*;

/**
 * Main for testing the functionality
 */
public class Main {
	public static void main(String[] args) {
		RemoteControl mediaPlayerRemote = new RemoteControl();

		ICommand onAction = new OnCommand();
		ICommand offAction = new OffCommand();

		ICommand playAction = new PlayCommand();
		ICommand stopAction = new StopCommand();

		ICommand nextAction = new NextCommand();
		ICommand previousAction = new PreviousCommand();

		ICommand[] negativeActions = {offAction, stopAction, previousAction};
		ICommand[] positiveActions = {onAction, playAction, nextAction};

		mediaPlayerRemote.configureActionButton(negativeActions, positiveActions); // TODO: configure the remote controls for the media player remote

		// TODO: test the functionality by pressing different buttons similar to below
		mediaPlayerRemote.actionButtonPressed(0);
		mediaPlayerRemote.actionButtonPressed(0);

		mediaPlayerRemote.actionButtonPressed(1);
		mediaPlayerRemote.actionButtonPressed(2);
		mediaPlayerRemote.undoButtonPressed();
		mediaPlayerRemote.undoButtonPressed();

		mediaPlayerRemote.actionButtonPressed(1);

		mediaPlayerRemote.actionButtonPressed(0);
		mediaPlayerRemote.actionButtonPressed(1);
		mediaPlayerRemote.actionButtonPressed(1);
		mediaPlayerRemote.actionButtonPressed(2);
		mediaPlayerRemote.undoButtonPressed();
		mediaPlayerRemote.undoButtonPressed();
		mediaPlayerRemote.undoButtonPressed();

	}
}

