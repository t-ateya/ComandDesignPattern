package com.CommandPattern.com.model;

import com.CommandPattern.com.interfaces.Command;

public class MarioDownCommand implements Command {
	
	private MarioCharacterReceiver marioCharacterReceiver;
	
	public MarioDownCommand (MarioCharacterReceiver marioCharacterReceiver) {
		this.marioCharacterReceiver = marioCharacterReceiver;
	}

	@Override
	public void execute() {
		marioCharacterReceiver.moveDown();
		
	}

}
