package com.practice.vehicle;

public class Car extends Vehicle{
	protected String type;
	protected Car(String color, String model, int wheels, String type) {
		super(color, model, wheels);
		this.type= type;
	}
	protected void brand() {
		System.out.println("it is a toyota brand car");
	}
	protected void model() {
		System.out.println("it is a camry model");
	}
//	@Override
//	public
//	 String toString() {
//		return "Car [type=" + type + ", color=" + color + ", model=" + model + ", wheels=" + wheels + "]";
//	}
	

}
