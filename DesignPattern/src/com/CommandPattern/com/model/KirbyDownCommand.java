package com.CommandPattern.com.model;

import com.CommandPattern.com.interfaces.Command;

public class KirbyDownCommand implements Command {
KirbyCharacterReceiver kirbyCharacterReceiver;
	
	public KirbyDownCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
		this.kirbyCharacterReceiver = kirbyCharacterReceiver;
		
	}


	@Override
	public void execute() {
		kirbyCharacterReceiver.moveDown();
		
	}

}
