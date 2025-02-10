package com.rays.exception.custom;

public class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double amt) {
		balance =balance+amt;
		//System.out.println(balnc);
	}

	public double withdraw(double amt) throws AccountException {
		
		if ((balance-2000) < amt) {
			AccountException e = new AccountException("Amount is less than 2000.....");
			throw e;
		}else {
			balance = balance - amt;
		}
		return balance;
	}

}
