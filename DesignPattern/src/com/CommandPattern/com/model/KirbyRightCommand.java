package com.CommandPattern.com.model;

import com.CommandPattern.com.interfaces.Command;

public class KirbyRightCommand implements Command{
	
KirbyCharacterReceiver kirbyCharacterReceiver;
	
	public KirbyRightCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
		
		this.kirbyCharacterReceiver = kirbyCharacterReceiver;
		
	}

	@Override
	public void execute() {
		kirbyCharacterReceiver.moveRight();
		
	}

}
