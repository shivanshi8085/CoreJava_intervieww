package com.rays.exception.custom;

public class AccountTest {
	public static void main(String[] args) {

		Account a = new Account();
		a.setBalance(5000);
		a.deposite(100);
		System.out.println(a.getBalance());
		try {
			a.withdraw(2000);
		} catch (AccountException e) {
			System.out.println(e);
		}
		a.deposite(11000);
		System.out.println(a.getBalance());

	}

}
