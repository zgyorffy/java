package com.calculator.myproject;

public abstract class CalculatorBase {
	
	private int val1;
	private int val2;
	private int result;
	
	public int getVal1() {return this.val1;}
	public void setVal1(int val1) {this.val1 = val1;}
	
	public int getVal2() {return this.val2;}
	public void setVal2(int val2) {this.val2 = val2;}
	
	public int getResult() {return this.result;}
	public void setResult(int result) {this.result = result;}
	
	public CalculatorBase() {};
	public CalculatorBase(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public abstract void calculate();

}
