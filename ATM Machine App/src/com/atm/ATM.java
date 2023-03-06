package com.atm;

import java.util.Scanner;

public class ATM {

	float balance;
	int PIN = 5674;
	Scanner sc = new Scanner(System.in);
	
	 public void checkPin() {
		 System.out.println(" **<Welcome to ATM Machine>**");
		 System.out.println("|============================|\n");
		 System.out.println("Enter Your ATM PIN: ");
		 
		 int enteredPin = sc.nextInt();
		 
		 if(enteredPin == PIN) {
			 menu();
		 }else {
			 System.out.println("====**Enter valid PIN!**====\n");
			 checkPin();
		 }
		 
	 }

	public void menu() {
		System.out.println("Enter your choice: ");
		System.out.println("1. Check A/C Balance: ");
		System.out.println("2. Withdraw Money: ");
		System.out.println("3. Deposit Money: ");
		System.out.println("4. EXIT");
		
		int opt = sc.nextInt();
		
		switch(opt) {
			case 1: checkBalance();
			menu();
			case 2: withdrawMoney();
			menu();
			case 3: depositMoney();
			menu();
			case 4: System.out.println("Thanks For the Service!");
			checkPin();
			default: System.out.println("Enter Valid choice!");
			menu();
		}
		
	}

	public void depositMoney() {
		System.out.println("Enter the Amount to deposit: ");
		float amount = sc.nextFloat();
		balance = balance+amount;
		System.out.println("Money Deposit Successful!");
	}

	public void withdrawMoney() {
		System.out.println("Enter Amount to withdraw: ");
		float amount = sc.nextFloat();
		if(amount > balance) {
			System.out.println("Insufficient balance!");
		}else {
			balance = balance-amount;
			System.out.println("Money Withdrawl Successful!");
			menu();
		}
		
	}

	public void checkBalance() {
		System.out.println("Balance: "+balance);
		menu();
		
	}
	
}
