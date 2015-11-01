package pl.bowlingcounter;

public class BowlingCounter {

	public Game bowlingGame;

	public static void main(String[] args) {

		BowlingCounter Bowl = new BowlingCounter();
		Bowl.initialize();

	}

	private void initialize() {

		Game bowlingGame = new Game();

		GUI userGUI = new GUI();
		userGUI.GUIforBowling();

	}
}
