package com.practice.vehicle;

public class Bus extends Vehicle{
	private int capacity;
	public Bus(String color, String model, int wheels, int capacity) {
		super(color, model, wheels);
		this.capacity = capacity;
	}
	public void islarger() {
		System.out.println("it is larger in size");
				
	}
	public void type() {
		System.out.println("it is a school bus");
	}
	@Override
	public String toString() {
		return "Bus [capacity=" + capacity + ", color=" + color + ", model=" + model + ", wheels=" + wheels + "]";
	}
	
}
