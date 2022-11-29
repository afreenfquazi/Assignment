package com.practice.assignment1;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {
		String[] words = { "naresh", "ganesh", "suresh", "mahesh", "rakesh" };
		String[] t = new String[words.length];
		Arrays.sort(words);
		for (int i = 0; i < words.length; i++) {
			t[i] = new StringBuilder(words[i]).reverse().toString();
			System.out.println(t[i]);
			
		}
		
		
	}

}
