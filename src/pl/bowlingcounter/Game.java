package pl.bowlingcounter;

import java.util.ArrayList;

public class Game {

	ArrayList<Player> Players = new ArrayList<>();
	boolean bowlingStarted = false;

	public Game() {
		this.Players.add(new Player("Player # 1"));
	}

	public void addPlayer() {
		if (!bowlingStarted) {
			this.Players.add(new Player());
		}
	}

	public void addPlayer(String name) {
		if (!bowlingStarted) {
			this.Players.add(new Player(name));
		}
	}

	public void start() {
		this.bowlingStarted = true;
	}

	public boolean isEnded() {
		for (Player player : Players) {
			if (player.isFinished() == false) {
				return false;
			}
		}
		return true;
	}

	public void resetBoard() {
		this.Players.clear();
		this.Players.add(new Player("Player #-1"));
		this.bowlingStarted = false;
	}

	public void PrintResults() {
		for (Player player : Players) {
			System.out.println("Result of " + player.getName() + " is " + player.score());
		}
	}

}
