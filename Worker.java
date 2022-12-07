package worker;

public class Worker {
	protected String name;
	protected double salaryRate;
	
	
	protected double pay(int hours) {
		double sal = salaryRate*hours;
		return sal;
	}
	public Worker(String name, double salaryRate) {
		super();
		this.name = name;
		this.salaryRate = salaryRate;
	}

}
