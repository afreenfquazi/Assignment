package com.practice.vehicle;

public class Truck extends Vehicle {
	protected boolean isHeadLight;
	public Truck(String color, String model, int wheels, boolean isHeadLight) {
		super(color, model, wheels);
		this.isHeadLight = isHeadLight;
	
	}

	protected void truck() {
		
	}
	protected void isLarger() {
		System.out.println("yes it is larger in size");
	}
	protected void type() {
		System.out.println("It is a pickup truck");
	}
//	@Override
//	public String toString() {
//		return "Truck [isHeadLight=" + isHeadLight + ", color=" + color + ", model=" + model + ", wheels=" + wheels
//				+ "]";
//	}
	
	
	
}
