package com.practice.assignment1;

public class BankAccount1 {
	public double currentBal = 5000;

	double deposit() {
		double deposit = 1000;
		return currentBal = currentBal + deposit;

	}

	double withdraw() {
		double withdraw = 500;
		return currentBal = currentBal - withdraw;
	}

	void getBalance() {
		System.out.println(currentBal);
		class InterestAdder {

			public void intCalc() {
				currentBal = currentBal + (currentBal * 12 / 100) / 12;
				System.out.println(currentBal);
			}
		}
		InterestAdder add = new InterestAdder();
		add.intCalc();
	}

	public static void main(String[] args) {
		BankAccount1 ba = new BankAccount1();
		System.out.println(ba.deposit());
		System.out.println(ba.withdraw());
		ba.getBalance();
		

		// System.out.println(intadd.intCalc());
	}

}