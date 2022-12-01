package com.practice.assignment1;

import java.util.Scanner;

public class StudentEx32 {

	public static void main(String[] args) {
		String name;
		String degree;
		int age;
		int totalmarks;
		float percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter degree");
		degree = sc.next();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter totalmarks");
		totalmarks = sc.nextInt();
		System.out.println("Enter percentage");
		percentage = sc.nextFloat();
		
		
		
		
		System.out.println("the name is"+name);
		System.out.println("degree "+degree);
		System.out.println(" age "+age);
		System.out.println("total marks "+totalmarks);
		System.out.println("percentage "+percentage);
	}

}
