package com.calculator.myproject;

public class Divider extends CalculatorBase {
	
	public Divider() {};
	public Divider(int val1, int val2) {
		super(val1,val2);
	}
	
	public void calculate() {
		int value = getVal1() - getVal2();
		setResult(value);
	}

}
