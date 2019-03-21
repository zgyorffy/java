package com.training.myproject;

public class Flight {
	
	//"fields" - store object state - can be initialized
	private int passengers;
	private int seats  = 150;
	private int flightNumber;
	private int maxCarryOns = seats * 2;
	private int totalCarryOns;
	private int totalCheckedBags;
	private char flightClass;
	private boolean[] isSeatAvailable;
	
	//override Object (object is the highest class)
	//every Object class has equals method!!!
	@Override
	public boolean equals(Object o){
		// Object o is a Flight class if not can't compare
		
		//super means that gets the base equal method from Obj. class
		if(super.equals(o)) {
			return true;
		}
		
		//override equals
		if(!(o instanceof Flight)) {
			return false;
		}
		
		Flight other = (Flight) o;
		return
				//other the opposite of this?
				flightNumber == other.flightNumber &&
				flightClass == other.flightClass;
	}
	
	//initialization block - runs when created.
	{
		isSeatAvailable = new boolean[seats];
	
		for(int i = 0; i < seats; i++) {
			isSeatAvailable[i] = true;
		}
	}
	
	//"constructor" - initial state - executable code used during obj. creation
	public Flight(){
		
	}
	
	public Flight(int flightNumber){
		//adding this() with no parameter calls constructor Flight with no parm.
		this();
		this.flightNumber = flightNumber;
	}
	
	public Flight(char flightClass){
		this.flightClass = flightClass;
	}
	
	//"getter" (accessor)
	public int getSeats() {
		
		return seats;
	}
	
	//"setter" (mutator)
	public void setSeats(int seats) {
		
		this.seats = seats;
	}
	
	//"method" - functions
	public void add1Passenger() {
		if (hasSeating()) {	
			passengers += 1;
		} 
		else {
			errorHandling();
		}
	}
	
	public void add1Passenger(int bags) {
		if(hasSeating()) {
			add1Passenger();
			totalCheckedBags += bags;
		}
	}
	
	//list of parameteres
	public void addPassengers(Passenger... list) {
		if(hasSeating(list.length)) {
			passengers += list.length;
			for (Passenger passenger : list) {
				totalCheckedBags += passenger.getCheckedBags();
			}
		}
		else {
			errorHandling();
		}
	}
	
	//very good boolean example
	private boolean hasSeating() {
		return passengers < seats;
	}
	
	private boolean hasSeating(int count) {
		return passengers + count <= seats;
	}
	
	private boolean hasCarryOnSpace(int carryOns) {
		return totalCarryOns + carryOns <= maxCarryOns;
	}
	
	public int passanger() {
		return passengers;
	}
	
	//info - you can use the Flight class within the Flight class interesting
	public boolean hasRoom(Flight f2) {
		            //this is reference to local variable passenger
		int total = this.passengers + f2.passengers;
		
		//very good boolean example!!!
		return total <= seats;
	}
	
	public Flight createNewWithBoth(Flight f2) {
		Flight newFlight = new Flight();
		newFlight.seats = seats;
		newFlight.passengers = passengers + f2.passengers;
		return newFlight;
	}
	
	//error Handling
	private void errorHandling() {
		System.out.println("to manny");
	}
	
}
