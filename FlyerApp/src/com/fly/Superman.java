package com.fly;

public class Superman extends Kryptonian implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("superman takingoff");
		
	}

	@Override
	public void land() {
		System.out.println("superman landed");
		
	}

	@Override
	public void fly() {
		System.out.println("superman flying");
		
	}
	
	public void leapBuilding() {
		System.out.println("superman leapBuilding");
		
	}
	
	public void stopBullets() {
		System.out.println("superman stopBullets");
		
	}
	
	
	public void eats() {
		System.out.println("superman eats");
		
	}

	/*
	 * @Override public void getDetails() { super.getDetails();
	 * System.out.println("hello i am superman"); }
	 */

}