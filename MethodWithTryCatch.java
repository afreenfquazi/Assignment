package com.practice.assignment2;

public class MethodWithTryCatch {
	
	public String msg() {
		String str = null;
		try {
			str = "this is a msg";
		}catch(StringIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}finally {
			return str;
		}
	}

	public static void main(String[] args) {
		MethodWithTryCatch m = new MethodWithTryCatch();
		String s = m.msg();
		System.out.println(s);

	}

}
