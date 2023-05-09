package com.customException.Bank;

public class TestGetBalanceException {

	public static void getBalnce(Bank b1) {
		try {
			if (b1.getPassword().equals("1234")) {
				if (b1.getBalance() > 5000.00) {
					throw new InsufficientBalanceException("Insufficient balnce");
				} else {
					System.out.println("balance Withdraw");
				}
			} else {
				System.out.println("please enter correct Pin");
			    }
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws InsufficientBalanceException {
		Bank b1 = new Bank("yogesh", "1238", 5000.0);
		getBalnce(b1);
	}
}
