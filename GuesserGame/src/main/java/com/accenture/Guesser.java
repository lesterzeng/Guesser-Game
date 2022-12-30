package com.accenture;

import java.util.Random;

public class Guesser {
	int gNum;
	public int guessNum() {
		Random rand = new Random();
		gNum = rand.nextInt(0, 10);
		System.out.println("Secret number: "+gNum);
		return gNum;
	}
}