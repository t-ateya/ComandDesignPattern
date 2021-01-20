package com.StrategyDesignPattern.com.model;

import com.StrategyDesignPattern.com.controller.ScoreAlgorithmBase;

public class Balloon extends ScoreAlgorithmBase {
	
	@Override 
	public int calculateScore(int taps, int multiplier) {
		return (taps*multiplier) -20;
	}

}
