package com.practice.assignment1;

public class Calculator {

	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public int sub(int a,int b) {
		int z=a-b;
		return z;
	}
	
	public int mul(int a,int b) {
		int multi=a*b;
		return multi;
	}
	public int div(int a,int b) {
		int divide=a/b;
		return divide;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(12, 14));
		System.out.println(cal.sub(12, 4));
		System.out.println(cal.mul(12, 3));
		System.out.println(cal.div(4, 2));
		
	}

}
