package com.practice.assignment1;

public class StringOperation {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println("1. The Character at 12th index " + str.charAt(12));
		if (str.contains("is")) {
			System.out.println("2. The String contains the word is");
		} else {
			System.out.println("2. The String does not contains the word is");
		}
		System.out.println(str.concat(" and killed it"));
		if (str.endsWith("dogs"))
			System.out.println("4. Ends with dogs");
		else
			System.out.println("4. Does not ends with dogs");

		if (str=="The quick brown Fox jump over the lazy Dog")
			System.out.println("5. Same string");
		else
			System.out.println("5. Different string");
		if (str=="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG")
			System.out.println("6. Same string");
		else
			System.out.println("6. Different string");

		System.out.println("7. Index position of char 'a' "+str.indexOf("a"));
		System.out.println("8. Last index position of char 'e' "+str.lastIndexOf("e"));
		System.out.println("9. Length of the string "+str.length());
		if(str.compareTo("The quick brown Fox jump over the lazy Dog")==0)
			System.out.println("10. String matches with given string");
		else
			System.out.println("10. String doesn't matches with given string");
		System.out.println("11. "+str.replace("The", "A"));
		String str1 = str.substring(0, 19);
		String str2 = str.substring(20, 43);
		System.out.println("12. Splitting the string");
		System.out.println("First String "+str1);
		System.out.println("Second String "+str2);
		System.out.println("13. "+str1.substring(16, 19));
		System.out.println(str2.substring(20, 23));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}

}
