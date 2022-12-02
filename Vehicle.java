package com.practice.vehicle;

public class Vehicle {
	protected String color;
	protected String model;
	protected int wheels;
	public Vehicle(String color, String model, int wheels) {
		this.color = color;
		this.model = model;
		this.wheels = wheels;
		
	}
	public void canHonk() {
		System.out.println("it can honk");
	}
	
	public void haveHeadlights() {
		System.out.println("Yes it has headlight");
	}
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", model=" + model + ", wheels=" + wheels + "]";
	}
	
	
}
