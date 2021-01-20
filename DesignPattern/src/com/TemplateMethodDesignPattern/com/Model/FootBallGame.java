package com.TemplateMethodDesignPattern.com.Model;

import com.TemplateMethodDesignPattern.com.interfaces.Game;

public class FootBallGame extends Game {

	@Override
	public void initialize() {
		System.out.println("FootBall Game inititializing...");
		
	}

	@Override
	public void startPlay() {
		System.out.println("FootBall Game playing...");
		
	}

	@Override
	public void endPlay() {
		System.out.println("FootBall Game ending ...");
		
	}

	@Override
	protected void addNewCharacterToTheGame() {
		// TODO Auto-generated method stub
		
	}
	

}
