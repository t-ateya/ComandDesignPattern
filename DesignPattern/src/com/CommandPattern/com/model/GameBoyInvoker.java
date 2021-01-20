package com.CommandPattern.com.model;

import com.CommandPattern.com.interfaces.Command;

public class GameBoyInvoker {
	private Command UpCommand, DownCommand, LeftCommand, RightCommand;
	
	
	//constructor
	public GameBoyInvoker(Command UpCommand, Command DownCommand, 
			Command LeftCommand, Command RightCommand) {
		this.UpCommand = UpCommand;
		this.DownCommand = DownCommand;
		this.LeftCommand = LeftCommand;
		this.RightCommand = RightCommand;
	}
	
	
	public void arrowUp() {
		UpCommand.execute();
	}
	
	public void arrowDown() {
		DownCommand.execute();
	}
	
	public void arrowLeft() {
		LeftCommand.execute();
	}
	
	public void arrowRight() {
		RightCommand.execute();
	}
}

