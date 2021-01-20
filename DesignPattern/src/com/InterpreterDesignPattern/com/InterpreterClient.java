package com.InterpreterDesignPattern.com;

public class InterpreterClient {
	public InterpreterContext interpreterContext;
	

	public static void main(String[] args) {
		String first = "13 in Binary";
		String second = "28 in Hexadecimal";
		//Client
		InterpreterClient interpreter = new InterpreterClient(new InterpreterContext());
		System.out.println(first+ " = " + interpreter.interpret(first));
		System.out.println(second+ " = " + interpreter.interpret(second));

	}
	
	
	public InterpreterClient(InterpreterContext interpreterContext) {
		this.interpreterContext = interpreterContext;
	}
	
	public String interpret(String str) {
		Expression expression = null;
		
		if (str.contains("Hexadecimal")) {
			expression = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(""))));
		}else if (str.contains("Binary")) {
			expression = new IntoBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(""))));
		}else return str;
		
		return expression.interpreter(interpreterContext);
	}

}
