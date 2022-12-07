package org.animals;

public class Elephant extends Animal{
	String color;
	float weight;
	int age;
	public void isVegetarian() {
		System.out.println("this elephant is vegetarian");
	}
	public void canClimb() {
		System.out.println("it cannot climb");
	}
	public void sound() {
		System.out.println("it makes sound thump thump");
	}
}
