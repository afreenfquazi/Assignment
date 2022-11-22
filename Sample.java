package com.practice.assignment1;

public class Sample {
	static int counter=0;
	
	public Sample() {
		 counter++;
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		Sample s4 = new Sample();
		System.out.println("Number of times class is instantiated: " +counter);
	}

}
