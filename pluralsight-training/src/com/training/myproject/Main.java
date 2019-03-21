package com.training.myproject;

import com.training.myproject.Flight;

public class Main {

	public static void main(String[] args) {
		
		//basic usage
		dataTypeConversion();
		conditionalAssignment();
		ifElse();
		whileLoop();
		doWhileLoop();
		forLoop();
		forEachLoop();
		switchStatemen();
		
		//class usage
		usingFlightClass();
		using2FlightClasses();
		usingSetterAndGetter();
		
		//class usage with parameter list
		listOfParameters();
		
		//class list
		listOfClasses();
		
		//Object class method - equals() example
		objectClassMethodEquals();
	
	}
	
	static void dataTypeConversion() {
		float floatVal = 1.0f;
		double doubleVal = 4.0d;
		byte byteVal = 7;
		short shortVal = 7;
		long longVal = 5;
		
		short res1 = (short)byteVal;
		short res2 = (short)(byteVal - longVal);
		float res3 = longVal - floatVal;
		
		System.out.println("success");
	}
	
	static void conditionalAssignment() {
		int v1 = 5;
		int v2 = 10;
		
		int vMax = v1 > v2 ? v1 : v2;
		
		System.out.println(vMax);
	}
	
	static void ifElse() {
		int v1 = 5;
		int v2 = 5;
		
		if (v1 > v2)
			System.out.println(v1);
		else if (v1 < v2)
			System.out.println(v2);
		else
			System.out.println("equal");
	}
	
	static void whileLoop() {
		int v1 = 5;
		
		while (v1 >= 0)
			System.out.print(v1--);
		
		System.out.println(" - while loop");
	}
	
	static void doWhileLoop() {
		int v1 = 0;
		
		do {
			System.out.print(v1--);
		} while (v1 >= 0);
		System.out.println(" - dowhile loop");
	}
	
	static void forLoop() {
		
		for(int iVal = 1; iVal <= 5; iVal += 1) {
			System.out.print(iVal);
		}
		System.out.println(" - for loop");
	}
	
	static void forEachLoop() {
		
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		
		for(int iVal = 0; iVal < array.length; iVal++) {
			System.out.print(array[iVal]);
		}
		System.out.println(" - array simple loop");
		
		//very nice
		int[] array2 = {1, 2, 3};
			
		for(int curElem:array2) {
			System.out.print(curElem);
		}
		System.out.println(" - array for-each loop");
	}
	
	static void switchStatemen() {
		
		int iVal = 10;
		
		switch(iVal % 2) {
		case 0:
			System.out.println("paros");
			break;
		case 1:
			System.out.println("paratlan");
			break;
		default:
			System.out.println("error");
			break;
				
		}
	}
	
	static void usingFlightClass() {
		
		int pass = 0;
		
		//using the Flight class
		Flight f1 = new Flight();
		
		f1.add1Passenger();
		f1.add1Passenger();
		
		System.out.print("passnegers nr: ");
		pass = f1.passanger();
		System.out.println(pass);
			
	}
	
	static void using2FlightClasses() {
		
		Flight f1 = new Flight();
		Flight f2 = new Flight();
		
		f1.add1Passenger();
		f1.add1Passenger();
		f1.add1Passenger();
		f2.add1Passenger();
		f2.add1Passenger();
		
		System.out.print("f1: ");
		System.out.print(f1.passanger());
		System.out.print(" f2: ");
		System.out.print(f2.passanger());
		
		//initialize f3 to null
		Flight f3 = null;
		
		if(f1.hasRoom(f2)) {
			f3 = f1.createNewWithBoth(f2);
			System.out.print(" f3 = (f1+f2): ");
			System.out.println(f3.passanger());
		}
			
	}
	
	static void usingSetterAndGetter() {
		Flight cjToB = new Flight();
		
		System.out.print("Before: ");
		System.out.print(cjToB.getSeats());
		System.out.print(" -> ");
		
		cjToB.setSeats(50);
		
		System.out.print("After: ");
		System.out.println(cjToB.getSeats());
		
	}
	
	static void listOfParameters() {
		Flight f = new Flight();
		
		Passenger zsolt = new Passenger(0,1);
		Passenger dani = new Passenger(0,2);
		f.addPassengers(zsolt,dani);
		
		Passenger vili = new Passenger(0,1);
		Passenger peti = new Passenger(0,2);
		Passenger andi = new Passenger(0,2);
		f.addPassengers(vili,peti,andi);
		
		System.out.print("number of passengers: ");
		System.out.println(f.passanger());
		
	}
	
	static void listOfClasses() {
		Flight[] squadron = new Flight[5];
		
		//only methods from Flight class
		squadron[0] = new Flight();
		//has everything from Flight + Cargoflight
		squadron[1] = new CargoFlight();
		squadron[2] = new Flight();
		squadron[3] = new CargoFlight();
		squadron[4] = new CargoFlight();
		
		
		System.out.println("listOfClasses() worked");
		
	}
	
	static void objectClassMethodEquals() {
		Flight f1 = new Flight(175);
		Flight f2 = new Flight(175);
		
		if(f1.equals(f2)) {
			System.out.println("f1 and f2 are equal");
		} else {
			System.out.println("f1 and f2 are not equal");
		}
	}
	
}
