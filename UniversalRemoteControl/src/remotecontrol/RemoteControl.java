package remotecontrol;

import java.util.Stack;

/**
 *  Base implementation for the remote control.
 */
public class RemoteControl implements IRemoteControl {

		public final static int NO_OF_ACTION_BUTTONS = 3;

		private boolean[] buttonStatus;
		private ICommand[] pairedActions;  // TODO: Data structures for the actions

		private Stack<Integer> undoButtonOrder;    // Added for undo action


	public RemoteControl() {
			buttonStatus = new boolean[NO_OF_ACTION_BUTTONS];
			pairedActions = new ICommand[NO_OF_ACTION_BUTTONS];  // TODO: Initialize data structures for the actions
			undoButtonOrder = new Stack<Integer>();
	}

		public void configureActionButton(ICommand[] pairedActions){	// TODO: Implement method for configuration of action buttons
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
				pairedActions[no].execute();   // TODO: Execute activation action
				undoButtonOrder.push(no);    // TODO: Configure undo (deactivation) action;
			} else {
				System.out.println("Button deactivated: " + no);
				pairedActions[no].undo(); // TODO: Execute deactivation action
				undoButtonOrder.push(no); // TODO: Configure undo (activation) action
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
			int no = undoButtonOrder.pop();
			actionButtonPressed(no); // TODO: Execute undo action
		}
}
