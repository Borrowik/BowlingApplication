package pl.bowlingcounter;

public class BowlingCounter {
	public static void main(String[] args) {

		BowlingCounter Bowl = new BowlingCounter();
		Bowl.start();
	}

	private void start() {
		GUI userGUI = new GUI();
		userGUI.GUIforBowling();

	}
}

/**
 * A frame that contains a message panel
 */
