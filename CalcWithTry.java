package com.practice.assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcWithTry {
	public int add(int a, int b) {
		int sum = a + b;
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
		CalcWithTry calc = new CalcWithTry();
		Scanner sc = new Scanner(System.in);
		try {
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		System.out.println(calc.add(a, b));
		System.out.println(calc.sub(a, b));
		System.out.println(calc.mul(a, b));
		System.out.println(calc.div(a, b));
		}
		catch(ArithmeticException ex ) {
			System.out.println("Cannot divide numberby zero");
		}
		catch(InputMismatchException ex1) {
			System.out.println("invalid input");
		}
		finally {
			sc.close();
		}
	}

}
