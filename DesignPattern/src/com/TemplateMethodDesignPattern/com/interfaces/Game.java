package com.TemplateMethodDesignPattern.com.interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Game {
	public abstract void initialize();
	public abstract void startPlay();
	public abstract void endPlay();
	
	//Template method -to be used everywhere
	public final void play() {
		loadAssets();
		initialize();
		startPlay();
		if (addNewCharacter()) {
			addNewCharacterToTheGame();
		}
		endPlay();
		
	}
	
	//Hooked-Template method. Hooked b/c we can hook it on other template methods as the classes are running
	protected abstract void addNewCharacterToTheGame();
	
	public void loadAssets() {
		System.out.println("Loading Game Assets!");
	}
	
	public boolean addNewCharacter() {
		return true;
	}

	
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
