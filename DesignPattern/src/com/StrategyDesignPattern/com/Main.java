package com.StrategyDesignPattern.com;
import com.StrategyDesignPattern.com.controller.ScoreBoard;
import com.StrategyDesignPattern.com.model.Balloon;
import com.StrategyDesignPattern.com.model.Clown;
import com.StrategyDesignPattern.com.model.SquareBalloon;

public class Main {

	public static void main(String[] args) {
		
		ScoreBoard scoreBoard = new ScoreBoard();
		
		System.out.print("Balloon Tap Score: ");
		scoreBoard.algorithmBase = new Balloon();
		scoreBoard.showScore(10, 5);

		System.out.print("Clown Tap Score: ");
		scoreBoard.algorithmBase = new Clown();
		scoreBoard.showScore(10, 5);
		
		System.out.print("SquareBalloon Tap Score: ");
		scoreBoard.algorithmBase = new SquareBalloon();
		scoreBoard.showScore(10, 5);
	}  

}
