package com.StrategyDesignPattern.com.model;

import com.StrategyDesignPattern.com.controller.*;

public class SquareBalloon extends ScoreAlgorithmBase{
	
	public int calculateScore(int taps, int multiplier) {
		return (taps*multiplier + 40);
	}

}
