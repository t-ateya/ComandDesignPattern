package com.FacadePattern.com;

public class ComputerFacade {
	//composition
		private CPU processor;
		private Memory ram;
		private HardDrive hd;
		
	public ComputerFacade(CPU processor, Memory ram, HardDrive hd) {
		super();
		this.processor = processor;
		this.ram = ram;
		this.hd = hd;
	}
	
	public void start() {
		processor.freeze();
		ram.load(132,hd.read(3456, 89));
		processor.jump(132);
		processor.execute();
	}
	

}
