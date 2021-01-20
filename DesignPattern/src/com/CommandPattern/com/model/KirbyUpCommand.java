package com.CommandPattern.com.model;

import com.CommandPattern.com.interfaces.Command;

public class KirbyUpCommand implements Command{
	KirbyCharacterReceiver kirbyCharacterReceiver;
	
	public KirbyUpCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
		this.kirbyCharacterReceiver = kirbyCharacterReceiver;
		
	}

	@Override
	public void execute() {
		kirbyCharacterReceiver.moveUp();
		
		
	}

}
