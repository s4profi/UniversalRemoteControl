package remotecontrol;

import java.util.Stack;

/**
 *  Base implementation for the remote control.
 */
public class RemoteControl implements IRemoteControl {

		public final static int NO_OF_ACTION_BUTTONS = 3;

		private boolean[] buttonStatus;
		private String[] pairedActions;  // TODO: Data structures for the actions

		private Stack<String> undoActions;    // Added for undo action


	public RemoteControl() {
			buttonStatus = new boolean[NO_OF_ACTION_BUTTONS];
			pairedActions = new String[NO_OF_ACTION_BUTTONS];  // TODO: Initialize data structures for the actions
			undoActions = new Stack<String>();
	}

		public void configureActionButton(String[] pairedActions){	// TODO: Implement method for configuration of action buttons
			this.pairedActions = pairedActions;
		}

		/**
		 * The action button was pressed.
		 * Depending on its status, it will execute an activate or deactivate action.
		 *
		 * @param no The number of the button.
		 */
		public void actionButtonPressed(int no) {
			// Execute action
			if (buttonStatus[no] == false) {
				System.out.println("Button activated: " + no);
				String[] actionsOfButton = pairedActions[no].split("/"); // TODO: Execute activation action
				System.out.println(actionsOfButton[0]);
				undoActions.push(actionsOfButton[1]);    // TODO: Configure undo (deactivation) action
			} else {
				System.out.println("Button deactivated: " + no);
				String[] actionsOfButton = pairedActions[no].split("/");
				System.out.println(actionsOfButton[1]); // TODO: Execute deactivation action
				undoActions.push(actionsOfButton[0]); // TODO: Configure undo (activation) action
			}
			// Invert button status
			buttonStatus[no] = !buttonStatus[no];
		}

		/**
		 * The undo button was pressed.
		 * It will undo the previous action.
		 */
		public void undoButtonPressed() {
			// Execute undo action
			System.out.println("Undo button pressed");
			System.out.println(undoActions.pop()); // TODO: Execute undo action
		}
}
