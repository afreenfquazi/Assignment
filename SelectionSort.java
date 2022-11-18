package com.practice.assignment1;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 54, 23, 67, 12,9,32,87,2,90,14,56,1,43,24};
		
		int k = 0;
		while(k<arr.length)
		{
		for(int i=0;i< arr.length-1;i++)
		{
			for(int j=i+1;j< arr.length;)
			{
				if(arr[i]>arr[j]) {
					arr[i] = arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
					break;
					
				}
				else
					j++;
			}
		
		}
		k++;
		}
		for(int p =0;p<arr.length;p++) {
			System.out.println(arr[p]);
		}
	}

}

