package com.accenture;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class App {

	public static void main(String args[]) {
		Umpire u = new AnnotationConfigApplicationContext(BeanConfig.class).getBean("umpireBean", Umpire.class);
		u.getGuesserNum();
		u.getPlayersNum();
		u.compareResults();
		
	}
}