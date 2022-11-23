package com.practice.assignment1;

public class StringEqual {

	public static void main(String[] args) {
		String str = new String("Welcome to Java World");
		String str2 = new String("Welcome to Java World");

		System.out.println(str.equals(str2));//true

		System.out.println(str == str2);//2 objects are created at different 
		                                //location so object locations are not equal that's why false

	}

}
