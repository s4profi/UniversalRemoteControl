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
		 * @param index The number of the button.
		 */
		public void actionButtonPressed(int index) {
			// Execute action
			if (buttonStatus[index] == false) {
				System.out.println("Button activated: " + index);
				pairedActions[index].execute();   // TODO: Execute activation action
				undoButtonOrder.push(index);    // TODO: Configure undo (deactivation) action;
			} else {
				System.out.println("Button deactivated: " + index);
				pairedActions[index].undo(); // TODO: Execute deactivation action
				undoButtonOrder.push(index); // TODO: Configure undo (activation) action
			}
			// Invert button status
			buttonStatus[index] = !buttonStatus[index];
		}

		/**
		 * The undo button was pressed.
		 * It will undo the previous action.
		 */
		public void undoButtonPressed() {
			// Execute undo action
			System.out.println("Undo button pressed");
			int index = undoButtonOrder.pop();
			actionButtonPressed(index); // TODO: Execute undo action
		}
}
