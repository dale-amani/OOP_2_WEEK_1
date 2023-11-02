package com.FundManager;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Menu extends Profile{
	Scanner scan = new Scanner(System.in);
	DecimalFormat cashFormat = new DecimalFormat("'Ksh.'###,##0.00");
	
	HashMap<String,Integer> userID = new HashMap<>();
	


	public void getLogin() throws IOException {
	    int x = 1;
	    while (x == 1) {
	        try {
	            userID.put("Ezra", 123);
	            userID.put("Dale", 456);

	            System.out.println("Welcome to your fund manager");
	            System.out.println("Enter your username:");
	            setUserName(scan.nextLine());

	            System.out.println("Enter your pin");
	            setPin(Integer.parseInt(scan.nextLine())); 
	            
	            String name = getUserName();
	            int pinNum = getPin();
	            
	            if (userID.containsKey(name) && userID.get(name) == pinNum) {
	                getFundType();
	                x = 0; 
	            } else {
	                System.out.println("Wrong credentials");
	            }
	        } catch (Exception e) {
	            System.out.println("Invalid input");
	        }
	    }
	}



	public void getFundType() throws IOException {
		System.out.println("Select funds to access: ");
		System.out.println("1. Spending");
		System.out.println("2. Saving");
		System.out.println("3. Exit");
		
		int selectedType = scan.nextInt();
		
		switch (selectedType) {
		case 1:
			getSpending();
			break;
		
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Operation complete.Happy Savings");
			getLogin();
			
		default:
			System.out.println("Invalid number");
			getFundType();
			
		}
	}
	
	public void getSpending() throws IOException {
		System.out.println("Choose Spending Options");
		System.out.println("1.View Balance");
		System.out.println("2.Withdraw Amount");
		System.out.println("3.Deposit Amount");
		System.out.println("4.Exit");
		
		int selectedType = scan.nextInt();
		
		switch (selectedType) {
		case 1:
			System.out.println("Spending balance is " + cashFormat.format(getSpendingBalance()));
			getFundType();
			break;
		
		case 2:
			getSpendingWithdrawAmount();
			getFundType();
			break;
			
		case 3:
			getSpendingDepositAmount();
			getFundType();
			break;
			
		case 4:
			System.out.println("Operation complete.Happy Savings");
			getLogin();
			
			
		default:
			System.out.println("Invalid number");
			getSpending();
			
		}
	}
	
	public void getSaving() throws IOException {
		System.out.println("Choose Savings Options");
		System.out.println("1.View Balance");
		System.out.println("2.Withdraw Amount");
		System.out.println("3.Deposit Amount");
		System.out.println("4.Exit");
		
		int selectedType = scan.nextInt();
		
		switch (selectedType) {
		case 1:
			System.out.println("Savings balance is " + cashFormat.format(getSpendingBalance()));
			getFundType();
			break;
		
		case 2:
			getSavingsWithdrawAmount();
			getFundType();
			break;
			
		case 3:
			getSavingsDepositAmount();
			getFundType();
			break;
			
		case 4:
			System.out.println("Operation complete.Happy Savings");
			getLogin();
			
			
		default:
			System.out.println("Invalid number");
			getSaving();
			
		}
	}
	
}
