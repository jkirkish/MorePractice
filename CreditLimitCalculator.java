/**Nov 5, 2018
 * @author Joseph Kirkish
 * Develop a Java application that determines whether any of the several department
 * store customers has exceeded the credit limit on a charge account. For each 
 * customer, the following facts are available .
 * a) account number
 * b) balance at the beginning of the month
 * c) total of all items charged by the customer this month
 * d) total of all credits applied to the customer's account this month
 * e) allowed credit limit
 * The program should input all of these facts as integers, calculate the new
 * balance (=beginning balance + charges-credits), display the new balance and
 * determine whether the new balance exceeded, the program should display the 
 * message "Credit limit exceeded"
 */
 
package chapterFour;


public class CreditLimitCalculator {
	
			//instance variables
			int accountNumber;
			int beginningBalance;
			int customerItemsTotal;
			int allCreditsApplied;
			int allowedCreditLimit;
			int newBalance;
			
			// constructor for CredlitLimitCalculator 
			public CreditLimitCalculator()
			{
				accountNumber = 144356871;
				beginningBalance = 100000;
				customerItemsTotal = 0;
				allCreditsApplied = 0;
				allowedCreditLimit = 15000;
				newBalance = 0;
				
			}
			public int getAccountNumber() {
				return accountNumber;
			}

			/**
			 * @param accountNumber the accountNumber to set
			 */
			public void setAccountNumber(int accountNumber) {
				this.accountNumber = accountNumber;
			}

			/**
			 * @return the beginningBalance
			 */
			public int getBeginningBalance() {
				return beginningBalance;
			}

			/**
			 * @param beginningBalance the beginningBalance to set
			 */
			public void setBeginningBalance(int beginningBalance) {
				this.beginningBalance = beginningBalance;
			}

			/**
			 * @return the customerItemsTotal
			 */
			public int getCustomerItemsTotal() {
				return customerItemsTotal;
			}

			/**
			 * @param customerItemsTotal the customerItemsTotal to set
			 */
			public void setCustomerItemsTotal(int customerItemsTotal) {
				this.customerItemsTotal = customerItemsTotal;
			}

			/**
			 * @return the allCreditsApplied
			 */
			public int getAllCreditsApplied() {
				return allCreditsApplied;
			}

			/**
			 * @param allCreditsApplied the allCreditsApplied to set
			 */
			public void setAllCreditsApplied(int allCreditsApplied) {
				this.allCreditsApplied = allCreditsApplied;
			}

			/**
			 * @return the allowedCreditLimit
			 */
			public int getAllowedCreditLimit() {
				return allowedCreditLimit;
			}

			/**
			 * @param allowedCreditLimit the allowedCreditLimit to set
			 */
			public void setAllowedCreditLimit(int allowedCreditLimit) {
				this.allowedCreditLimit = allowedCreditLimit;
			}
            /**
             * calculate the new balance 
             */
			public int newBalance(int customerItemsTotal1,int allCreditsApplied1){
				
				newBalance = beginningBalance +(allCreditsApplied1-customerItemsTotal1);
				return newBalance;
			}
			/**
			 * display the new balance and determine if new balance exceeds customers credit line. 
			 */
			public void displayNewBalance()
			{
				System.out.println("The new balance in the bank Account is: $" + newBalance);
				System.out.println("The credit limit is $" +  allowedCreditLimit);
				if(allCreditsApplied > allowedCreditLimit)
				System.out.println("Credit Limit exceeded!");
			}
	
	

}
