package com.practice.assignment1;

public class FibonacciEx {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;

		while (num1 <= 200) {
			System.out.println(num1);
			int temp = num1 + num2;
			num1 = num2;
			num2 = temp;

		}

	}

}
