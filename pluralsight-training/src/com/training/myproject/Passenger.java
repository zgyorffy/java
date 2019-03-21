package com.training.myproject;

//final - doesn't allow to extend Passenger
final public class Passenger {
	private int checkedBags;
	private int freeBags;
	private double perBagFee;
	
	
	public int getCheckedBags() {
		return this.checkedBags;
	}
	
	public int getFreeBags() {
		return this.freeBags;
	}
	
	public double getPerBagFee() {
		return this.perBagFee;
	}
	
	//default constructor
	public Passenger() {
		
	}
	
	//constructor with parameter
	public Passenger(int freeBags) {
		//calls private Passenger constructor
		this(freeBags > 1 ? 25.0d : 50.0d);
		this.freeBags = freeBags;
	}
	
	public Passenger(int freeBags, int checkedBags){
		//calls Passenger with parameter constructor
		this(freeBags);
		this.checkedBags = checkedBags;
	}
	
	private Passenger(double perBagFee) {
		this.perBagFee = perBagFee;
	}
}
