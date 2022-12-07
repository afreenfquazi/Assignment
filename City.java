package com.practice.vehicleextension;
//in different package
import com.practice.vehicle.Bus;
import com.practice.vehicle.Car;
import com.practice.vehicle.Truck;
import com.practice.vehicle.Vehicle;

public class City {

	public static void main(String[] args) {
		Truck tk = new Truck("Green", "rogue", 8, true);
		System.out.println(tk.display());
		Car cr = new Car("Red", "Subaru", 4, "Sedan");
		System.out.println(cr.display());
		Vehicle bs = new Bus("Yellow", "Benz", 6, 50);
		System.out.println(bs.display());
	
		

	}

}
