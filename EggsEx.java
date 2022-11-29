package com.practice.assignment1;

import java.util.Scanner;

public class EggsEx {

	public static void main(String[] args) {
		int eggs = 0;
		int temp=0;
		int temp1=0,temp2 =0;
				int dozen=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of eggs");
		eggs = sc.nextInt();
		
			temp = eggs / 144;
			temp1 = eggs%144;
			dozen = temp1/12;
			temp2 = temp1%12;
			
			
			System.out.println(temp+" Gross "+dozen+" dozens "+temp2);
		
	}

}
