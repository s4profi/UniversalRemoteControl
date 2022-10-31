import remotecontrol.RemoteControl;

/**
 * Main for testing the functionality
 */
public class Main {
	public static void main(String[] args) {
		RemoteControl mediaPlayerRemote = new RemoteControl();

		String[] pairedActions = {"on/off", "play/pause", "next/previous"}; 	// TODO: configure the remote controls for the media player remote

		mediaPlayerRemote.configureActionButton(pairedActions);
		// TODO: test the functionality by pressing different buttons similar to below
		mediaPlayerRemote.actionButtonPressed(0);
		mediaPlayerRemote.actionButtonPressed(0);

		mediaPlayerRemote.actionButtonPressed(1);
		mediaPlayerRemote.actionButtonPressed(2);
		mediaPlayerRemote.undoButtonPressed();

		mediaPlayerRemote.actionButtonPressed(1);

		mediaPlayerRemote.actionButtonPressed(0);
		mediaPlayerRemote.actionButtonPressed(1);
		mediaPlayerRemote.actionButtonPressed(2);
		mediaPlayerRemote.undoButtonPressed();
		mediaPlayerRemote.undoButtonPressed();
		mediaPlayerRemote.undoButtonPressed();

	}
}

