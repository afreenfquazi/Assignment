package com.practice.assignment1;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		int pnum = 0;
		float price=0f;
		int quantity = 0;
		float total= 0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product number");
		pnum = sc.nextInt();
		
		switch(pnum) {
		case 1:
			price = 22.50f;
			System.out.println("Enter quantity sold");
			quantity = sc.nextInt();
			total = price * quantity;
			System.out.println("Total retail value of product number "+pnum+" is "+total);
			
			break;
		case 2:
			price = 44.50f;
			System.out.println("Enter quantity sold");
			quantity = sc.nextInt();
			total = price * quantity;
			System.out.println("Total retail value of product number "+pnum+" is "+total);
			
			break;
		case 3:
			price = 9.98f;
			System.out.println("Enter quantity sold");
			quantity = sc.nextInt();
			total = price * quantity;
			System.out.println("Total retail value of product number "+pnum+" is "+total);
			
			break;
		default:
			System.out.println("No such product exists");
		}
	

	}

}
