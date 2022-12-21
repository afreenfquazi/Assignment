package com.practice.assignment2;

public class CustonUserDefinedExcep {

	public static void main(String[] args) {
		try {
			throw new MyException("caught");
		}catch(MyException ex) {
			System.out.println(ex.getMessage());
		}



	}

}
class MyException extends Exception{
	
	MyException(String s){
		super(s);
	}
}