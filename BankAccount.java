package com.practice.assignment1;

public class BankAccount {
	public double currentBal=5000;
	
	double deposit() {
		double deposit=1000;
		return currentBal = currentBal+deposit;
		
	}
	double withdraw() {
		double withdraw=500;
		return currentBal = currentBal-withdraw;
	}
	void getBalance() {
		System.out.println(currentBal);
	}

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		System.out.println(ba.deposit());
		System.out.println(ba.withdraw());
		ba.getBalance();
		BankAccount.InterestAdder intadd = ba.new InterestAdder();
		
		System.out.println(intadd.intCalc());
	}
	public class InterestAdder{
		
		public double intCalc() {
		 return currentBal = (currentBal*12/100)/12;
		}
	}

}
