package com.experiment.myproject;

public class Adder extends CalculatorBase{
	
	public Adder() {};
	public Adder(int val1, int val2) {
		super(val1, val2);
	}
	
	@Override
	public void calculate() {
		int value = getVal1() + getVal2();
		setResult(value);
	}
	

}
