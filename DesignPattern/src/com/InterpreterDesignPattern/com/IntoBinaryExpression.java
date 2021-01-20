package com.InterpreterDesignPattern.com;

public class IntoBinaryExpression implements Expression {
	
	private int i;
	
	public IntoBinaryExpression(int i) {
		setI(i);
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	@Override 
	public String interpreter(InterpreterContext interpreter) {
		return interpreter.getBinaryFormat(getI());
	}

}
