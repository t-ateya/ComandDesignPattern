package com.CommandPattern.com.model;

import com.CommandPattern.com.interfaces.Command;

public class KirbyLeftCommand implements Command{
	
		KirbyCharacterReceiver kirbyCharacterReceiver;
	
		public KirbyLeftCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
		
		this.kirbyCharacterReceiver = kirbyCharacterReceiver;
		
	}

	@Override
	public void execute() {
		kirbyCharacterReceiver.moveLeft();
		
	}

}
