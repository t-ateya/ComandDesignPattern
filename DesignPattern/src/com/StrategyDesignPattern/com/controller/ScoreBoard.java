package com.StrategyDesignPattern.com.controller;

public class ScoreBoard {
	public ScoreAlgorithmBase algorithmBase; //creating an instance of ScoreAlgorithmBase
	
	public void showScore (int taps, int multiplier) {
		System.out.println(algorithmBase.calculateScore(taps, multiplier));
	}

}
