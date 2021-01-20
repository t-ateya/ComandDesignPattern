package com.TemplateMethodDesignPattern.com.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.TemplateMethodDesignPattern.com.interfaces.Game;


public class EndlessRunnerGame extends Game {

	@Override
	public void initialize() {
		
		System.out.println("Endless Runner Initializing...");
	}

	@Override
	public void startPlay() {
		System.out.println("Endless Runner starting...");
		playerWantsNewCharacter();
		
	}

	@Override
	public void endPlay() {
		System.out.println("Endless Runner ending...");
		
	}

	@Override
	protected void addNewCharacterToTheGame() {
		System.out.println("Adding a new Character to the game");
		
		}
	public boolean playerWantsNewCharacter() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		}else
			return false;
	}

	
	
	//Add more methods
	private String getUserInput() {
		
		String answer = null;
		System.out.println("Would you like to add a new character to the game? (y/n)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //Gets whatever input entered and stores it in buffer
		
		try {
			answer = in.readLine();
			
		} catch (IOException ioe) {
			System.out.println("IO Error");
		}
		
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
