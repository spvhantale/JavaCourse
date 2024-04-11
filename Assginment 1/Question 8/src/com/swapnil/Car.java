package com.swapnil;

public abstract class Car implements Vehicle{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving a Car");
	}

	public abstract void fuelType();
	
	
}
