package com.practice.assignment2;

public class ResetObjectFinally {

	public static void main(String[] args) {
		Employee e;
		try {
		 e = new Employee(111,"naresh");
		 System.out.println(e);
		}catch(NullPointerException ex) {
			System.out.println("there is no object");
		}finally {
			e=null;
			System.out.println(e);
		}
		

	}

}
class Employee {
	private int id;
	private String name;
	Employee(int id,String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
