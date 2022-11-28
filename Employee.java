package com.practice.assignment1;

public class Employee {
	private String empName;
	private int empId;
	private int empAge;
	private String empDesgn;
	private String empLocation;
	private int empExpInYrs;
	
	public Employee(String empName, int empId, int empAge, String empDesgn, String empLocation, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empDesgn = empDesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName) {
		super();
		this.empName = empName;
	}
	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

	public Employee(String empName, int empId, int empAge) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
	}

	public Employee(String empName, int empId, String empDesgn) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDesgn = empDesgn;
	}

	public Employee(String empName, int empId, int empAge, String empDesgn) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empDesgn = empDesgn;
	}

	

	public Employee(String empName, int empId, String empDesgn, String empLocation, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDesgn = empDesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, int empId, int empAge, int empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empExpInYrs = empExpInYrs;
	}
	

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAge=" + empAge + ", empDesgn=" + empDesgn
				+ ", empLocation=" + empLocation + ", empExpInYrs=" + empExpInYrs + "]";
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Ramesh");
		Employee emp2 = new Employee("Suresh",101);
		Employee emp3 = new Employee("Ganesh",102,"Manager");
		Employee emp4 = new Employee("Naresh",103);
		Employee emp5 = new Employee("Mahesh",103,34,"Director","hyd",3);
		Employee emp6 = new Employee("Kamlesh");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		System.out.println(emp6);
	}
	

}
