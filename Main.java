package com.practice.assignment1;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Shape();
		System.out.println("Area of Square is "+shape.area(4));
		System.out.println("Area of Rectangle is "+shape.area(2, 4));
		System.out.println("Perimeter of square is "+shape.perimeter(3));
		System.out.println("Perimeter of rectangle is "+shape.perimeter(3,5));
	}

}
