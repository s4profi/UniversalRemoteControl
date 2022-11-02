
import remotecontrol.*;

/**
 * Main for testing the functionality
 */
public class Main {
	public static void main(String[] args) {
		RemoteControl mediaPlayerRemote = new RemoteControl();

		ICommand onOffAction = new OnOffCommand();
		ICommand playStopAction = new PlayStopCommand();
		ICommand nextPreviousAction = new NextPreviousCommand();
		ICommand[] pairedActions = {onOffAction, playStopAction, nextPreviousAction};
		mediaPlayerRemote.configureActionButton(pairedActions); // TODO: configure the remote controls for the media player remote

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

