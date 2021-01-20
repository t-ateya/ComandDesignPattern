package com.CommandPattern.com;

import com.CommandPattern.com.model.GameBoyInvoker;
import com.CommandPattern.com.model.KirbyCharacterReceiver;
import com.CommandPattern.com.model.KirbyDownCommand;
import com.CommandPattern.com.model.KirbyLeftCommand;
import com.CommandPattern.com.model.KirbyRightCommand;
import com.CommandPattern.com.model.KirbyUpCommand;
import com.CommandPattern.com.model.MarioCharacterReceiver;
import com.CommandPattern.com.model.MarioDownCommand;
import com.CommandPattern.com.model.MarioLeftCommand;
import com.CommandPattern.com.model.MarioRightCommand;
import com.CommandPattern.com.model.MarioUpCommand;

public class Main {
	public static void main(String [] args) {
		
		//Creating our Receivers
		
		MarioCharacterReceiver mario = new MarioCharacterReceiver();
		mario.setName("Mario");
		
		KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();
		kirby.setName("Kirby");
		
		//Create Commands
		
		//System.out.println("The following are Mario Commands!");
		MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
		MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
		MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
		MarioRightCommand marioRightCommand = new MarioRightCommand(mario);
		
		
		//System.out.println("The following are Kirby Commands");
		KirbyUpCommand kirbyUpCommand = new KirbyUpCommand(kirby);
		KirbyDownCommand kirbyDownCommand = new KirbyDownCommand(kirby);
		KirbyLeftCommand kirbyLeftCommand = new KirbyLeftCommand(kirby);
		KirbyRightCommand kirbyRightCommand = new KirbyRightCommand(kirby);
		
		
		//Invoker
		GameBoyInvoker gameboy = new GameBoyInvoker(marioUpCommand, marioDownCommand, marioLeftCommand, marioRightCommand);
		gameboy.arrowUp();
		
		
		GameBoyInvoker gameboy2 = new GameBoyInvoker(kirbyUpCommand, kirbyDownCommand, kirbyLeftCommand, kirbyRightCommand);
		gameboy2.arrowDown(); 
		gameboy2.arrowUp();
		gameboy2.arrowLeft();
		gameboy2.arrowRight();
		
		
		
		
		
		
	}

}
