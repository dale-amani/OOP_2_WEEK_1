package com.FundManager;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Profile {
	
	private String userName;
	private int pin;
	private float spendingBalance = 0;
	private float savingBalance = 0;
	
	Scanner scan = new Scanner(System.in);
	DecimalFormat cashFormat = new DecimalFormat("'Ksh.'###,##0.00");
	
	public String setUserName(String userName) {
		this.userName = userName;
		return userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int setPin(int pin) {
		this.pin = pin;
		return pin;
	}
	
	public int getPin() {
		return pin;
	}
	
	public float getSpendingBalance() {
		return spendingBalance;
	}
	public float getSavingBalance() {
		return savingBalance;
	}
	
	public float calcSpendingDeposit(float amount) {
		spendingBalance += amount;
		return spendingBalance;
	}
	
	public float calcSpendingWithdrawal(float amount) {
		spendingBalance -=amount;
		return spendingBalance;
	}
	
	public float calcSavingDeposit(float amount) {
		savingBalance += amount;
		return savingBalance;
	}
	
	public float calcSavingWithdrawal(float amount) {
		savingBalance -= amount;
		return savingBalance;
	}

public void getSavingsWithdrawAmount() {
		
		System.out.println("Your savings balance is: "+ cashFormat.format(savingBalance));
		System.out.println("Enter withdrawal amount:");
		float amount = scan.nextFloat();
		if(savingBalance >= amount) {
			calcSavingWithdrawal(amount);
			System.out.println("Your new savings balance is: "+ cashFormat.format(savingBalance));
		}else {
			System.out.println("Insufficient funds for withdrawal");

		}
	}
	
	public void getSavingsDepositAmount() {
		System.out.println("Your savings balance is: "+ cashFormat.format(savingBalance));
		System.out.println("Enter deposit amount:");
		float amount = scan.nextFloat();
		if(amount >= 1) {
			calcSavingDeposit(amount);
			System.out.println("Your new savings balance is: "+ cashFormat.format(savingBalance));
		}else {
			System.out.println("Invalid amount. Cannot be zero or negative");

		}
	}
	
	public void getSpendingWithdrawAmount() {
		System.out.println("Your spendings balance is: "+ cashFormat.format(spendingBalance));
		System.out.println("Enter withdrawal amount:");
		float amount = scan.nextFloat();
		if(spendingBalance >= amount) {
			calcSpendingWithdrawal(amount);
			System.out.println("Your new spendings balance is: "+ cashFormat.format(spendingBalance));
		}else {
			System.out.println("Insufficient funds for withdrawal");

		}

	}
	
	public void getSpendingDepositAmount() {
		System.out.println("Your spendings balance is: "+ cashFormat.format(spendingBalance));
		System.out.println("Enter deposit amount:");
		float amount = scan.nextFloat();
		if(amount >= 1) {
			calcSpendingDeposit(amount);
			System.out.println("Your new spendings balance is: "+ cashFormat.format(spendingBalance));
		}else {
			System.out.println("Invalid amount. Cannot be zero or negative");

		}
	}

}
