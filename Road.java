package com.practice.vehicle;

public class Road {

	public static void main(String[] args) {
		Truck tk = new Truck();
		tk.canHonk();
		tk.isLarger();
		tk.type();
		Car cr = new Car();
		cr.canHonk();
		cr.brand();
		cr.model();
		
		Bus bs = new Bus();
		bs.canHonk();
		bs.type();
	}

}
