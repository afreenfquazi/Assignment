package com.practice.assignment1;

import java.util.Scanner;

public class LeapEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int yr = sc.nextInt();
		if ((yr % 400 == 0) || ((yr % 4 == 0)&&(yr%100!=0)))
			System.out.println("It's a leap year");

		else
			System.out.println("It's not a leap year");
		sc.close();

	}

}
