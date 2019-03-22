package com.experiment.myproject;

public class Main {

	public static void main(String[] args) {
		
		//a good example of inheritance java!!!
		
		CalculatorBase c = new Adder();
		c.calculate();
		
		System.out.print("result: ");
		System.out.println(c.getResult());
		
		int a = 1;
		int b = 2;
		
		CalculatorBase c2 = new Adder(a, b);
		c2.calculate();
		
		System.out.print("result: ");
		System.out.println(c2.getResult());
	}

}
