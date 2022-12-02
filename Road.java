package com.practice.vehicle;

public class Road {

	public static void main(String[] args) {
		
		Truck tk = new Truck("RED","Rogue",4,true);
		System.out.println(tk.toString());
		tk.canHonk();
		tk.isLarger();
		tk.type();
		Car cr = new Car("Blue","Infinity",4,"Sedan");
		System.out.println(cr.toString());
		cr.canHonk();
		cr.brand();
		cr.model();
		
		Bus bs = new Bus("Yellow", "Subaru",4,50);
		System.out.println(bs.toString());
		bs.canHonk();
		bs.type();
	}

}
