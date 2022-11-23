package com.practice.assignment1;
import java.math.*;
public class ArrayOperation {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		float avg = 0;
		int sum = 0;
		for(int value :arr) {
			sum = sum+value;
		}
		avg = (float)sum/arr.length;
		System.out.println("The sum of array elements is "+sum);
		System.out.println("The sum of array elements is "+avg);

	}

}
