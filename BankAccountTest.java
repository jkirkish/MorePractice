/**
 * 
 */
package chapterThree;

import java.util.Scanner;

/**
 * @author jkirkish
 * Date 08/09/2018
 */
public class BankAccountTest {

	
	//main method begins execution of Java Application
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(500000.00); //the BankAccount object
		BankAccount account2 = new BankAccount(253987.00);//create BankAccount object
		
		//display initial balance of each object
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());
		
		//create Scanner to obtain input from commmand window
		Scanner input = new Scanner(System.in);
		double depositAmount;//deposit amount read from user
		double debitAmount; //debit amount read from user
		
		System.out.print("Enter deposit amount for acount1: ");// prompt
		depositAmount = input.nextDouble();// obtain user amount
		account1.deposit(depositAmount);
		System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);// add the balance
		
		//display balances
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());
		
		//bankAccount2
		System.out.print("Enter deposit amount for acount2: ");// prompt
		depositAmount = input.nextDouble();// obtain user amount
		account2.deposit(depositAmount);
		System.out.printf("\nadding %.2f to account2 balance\n\n", depositAmount);// add the balance
		
		//display balances
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());
		
		
		//test a debit amount
		System.out.print("Enter debit amount for acount1: ");// prompt
		debitAmount = input.nextDouble();// obtain user amount
		account1.debit(debitAmount);
		System.out.printf("\nDebit %.2f to account1 balance\n\n", debitAmount);// add the balance
		
		//display balances
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());
		
		//bankAccount2
		System.out.print("Enter debit amount for acount2: ");// prompt
		debitAmount = input.nextDouble();// obtain user amount
		account2.debit(debitAmount);
		System.out.printf("\ndebit %.2f to account2 balance\n\n", debitAmount);// add the balance
		
		//display balances
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());
		

	}//end main

}//end class BankAccountTest
