package worker;

public class Main {

	public static void main(String[] args) {
		DailyWorker dw = new DailyWorker("Suresh",300);
		System.out.println("Dailyworker Weekly Salary is "+dw.pay(5));
		SalariedWorker sw = new SalariedWorker("Naresh",45);
		System.out.println("Salaried Worker Weekly salary is "+sw.pay(40));
		

	}

}
