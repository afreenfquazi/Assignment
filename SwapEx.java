package com.practice.assignment1;

import java.util.Scanner;

public class SwapEx {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two value to swap");
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Before Swapping Value of a and b is "+a+" "+b);
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping Value of a and b is "+a+" "+b);
		sc.close();
	}

}
