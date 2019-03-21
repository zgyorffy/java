package com.training.myproject;

public class CargoFlight extends Flight {
	float maxCargoSpace = 1000.0f;
	float usedCargoSpace;
	
	//final doesn't let override method
	final public void add1Package(float h, float w, float d) {
		float size = h * w * d;
		if(hasCargoSpace(size)) {
			usedCargoSpace += size;
		} else {
			handleNoSpace();
		}
	}
	
	private boolean hasCargoSpace(float size) {
		return this.usedCargoSpace + size <= this.maxCargoSpace;
	}
	
	private void handleNoSpace() {
		System.out.println("No space");
	}

}
