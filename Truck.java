package com.practice.vehicle;

public class Truck extends Vehicle {
	private boolean isHeadLight;
	public Truck(String color, String model, int wheels, boolean isHeadLight) {
		super(color, model, wheels);
		this.isHeadLight = isHeadLight;
	
	}
	public void truck() {
		
	}
	public void isLarger() {
		System.out.println("yes it is larger in size");
	}
	public void type() {
		System.out.println("It is a pickup truck");
	}
	@Override
	public String toString() {
		return "Truck [isHeadLight=" + isHeadLight + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
