package com.TemplateMethodDesignPattern.com;

import com.TemplateMethodDesignPattern.com.Model.EndlessRunnerGame;
import com.TemplateMethodDesignPattern.com.Model.FootBallGame;
import com.TemplateMethodDesignPattern.com.interfaces.Game;

public class Main {

	public static void main(String[] args) {
		
		
		Game game = new EndlessRunnerGame();
		game.play();
		
//		System.out.println("======================");
//		game = new FootBallGame();
//		game.play();
		

	}

}
