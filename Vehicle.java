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
	protected void canHonk() {
		System.out.println("it can honk");
	}
	
	protected void haveHeadlights() {
		System.out.println("Yes it has headlight");
	}
	public String display() {
		return "Vehicle [color=" + color + ", model=" + model + ", wheels=" + wheels + "]";
	}
	
	
	
}
