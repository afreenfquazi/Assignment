package com.practice.vehicle;

public class Bus extends Vehicle{
	protected int capacity;
	protected Bus(String color, String model, int wheels, int capacity) {
		super(color, model, wheels);
		this.capacity = capacity;
	}
	protected void islarger() {
		System.out.println("it is larger in size");
				
	}
	protected void type() {
		System.out.println("it is a school bus");
	}
//	@Override
//	public String toString() {
//		return "Bus [capacity=" + capacity + ", color=" + color + ", model=" + model + ", wheels=" + wheels + "]";
//	}
	
}
