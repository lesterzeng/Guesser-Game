package com.accenture;

import java.util.Random;

public class Player {

	int gNum;
	
	public int guessNum() {

		Random rand = new Random();
		gNum = rand.nextInt(0, 10);

		return gNum;
	}
}