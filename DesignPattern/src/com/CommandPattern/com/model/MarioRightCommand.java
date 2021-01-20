package com.CommandPattern.com.model;

import com.CommandPattern.com.interfaces.Command;

public class MarioRightCommand implements Command {
private MarioCharacterReceiver marioCharacterReceiver;
	
	public MarioRightCommand( MarioCharacterReceiver marioCharacterReceiver) {
		this.marioCharacterReceiver = marioCharacterReceiver;
	}

	@Override
	public void execute() {
		marioCharacterReceiver.moveRight();
		
	}

}
