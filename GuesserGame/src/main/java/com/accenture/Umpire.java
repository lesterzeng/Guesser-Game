package com.accenture;

public class Umpire {
	int guesserNum;
	int[] playerNum = new int[3];
	private Player player1;
	private Player player2;
	private Player player3;
	private Guesser guesser;
	

	
	public Umpire(Player player1, Player player2, Player player3, Guesser guesser) {
		this.player1 = player1;
		this.player2 = player2;
		this.player3 = player3;
		this.guesser = guesser;
	}
	
	public void getGuesserNum() {
		
		guesserNum = guesser.guessNum();
	}
	
	public void getPlayersNum() {
		
		playerNum[0] = player1.guessNum();
		playerNum[1] = player2.guessNum();
		playerNum[2] = player3.guessNum();
		
	}
	
	public void compareResults() {
		
		System.out.println("Player 1 guessed " + playerNum[0]);
		System.out.println("Player 2 guessed " + playerNum[1]);
		System.out.println("Player 3 guessed " + playerNum[2]);
		
		
		boolean correctNumber = false;
		for(int i = 0; i < playerNum.length; i++) {
			
			if (guesserNum == playerNum[i]) {
				System.out.println("Player "+ (i+1) +" guessed the correct number.");
				correctNumber = true;
			}
		}
		if (!correctNumber)
			System.out.println("No winners.");
	}

}