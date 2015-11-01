package pl.bowlingcounter;

public class Player implements BowlingGameResultCalculator {

	private static int nextId = 2;

	private String name = "";
	private int[] ScoreTable = new int[20];
	private int throwID = 0;
	private boolean finished = false;

	public Player(String str) {

		if (str.equals("Player #-1")) {
			nextId = 2;
			str = "Player #1";
		}

		this.name = str;
	}

	public Player() {
		this("Player #" + nextId);
		++nextId;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public void roll(int numberOfPins) {
		if (numberOfPins >= 0 && numberOfPins <= 10) {

			throwID++;

		} else
			System.out.println("Imposible number of pins in one throw");

	}

	@Override
	public int score() {
		return totalScore();
	}

	@Override
	public boolean isFinished() {
		if (finished)
			return true;
		return false;
	}

	private int totalScore() {
		int sum = 0;
		for (int i : ScoreTable) {
			sum += i;
		}

		return sum;
	}

}
