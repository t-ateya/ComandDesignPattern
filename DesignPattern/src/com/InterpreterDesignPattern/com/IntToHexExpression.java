package com.InterpreterDesignPattern.com;

public class IntToHexExpression  implements Expression{
	
	private int i;
	public IntToHexExpression(int i) {
		setI(i);
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i =i;
	}
	
	@Override
	public String interpreter(InterpreterContext interpreterContext) {
		
		return interpreterContext.getHexadecimalFormat(getI());
	}

}
