package com.practice.assignment1;

public class CopyArray {

	public static void main(String[] args) {
		int arr1[] = {23, 19, 24,56,54,32,89,65};
		int arr2[] = new int[8];
		for(int i = 0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i]; 
			System.out.println(arr2[i]);
		}
		
		

	}

}
