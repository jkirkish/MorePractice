package chapterFour;

import java.util.Scanner;

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

public class CreditLimitCalculatorTest {
	
	

	public static void main(String[] args) {
		
		// Objects
		Scanner object = new Scanner(System.in);
		CreditLimitCalculator balance = new CreditLimitCalculator();
		int itemsCharged = 0;
		int	creditSum = 0;
		int total = 0;
		int itemCounter = 0;
		int creditTotal = 0;
		int CreditNumber = 0;
		//Prompt bank customer for their name
		System.out.print("Hello, what is your name? ");
		String name = object.nextLine();
		
		//Show account number, beginning monthly balance and prompt the user to enter all of the items charged
		System.out.println("AccountNumber: " + balance.getAccountNumber() );
		System.out.println("Hello " + name + " Your current Balance for the month is $" + balance.getBeginningBalance());
		System.out.println("Your allowed credit limit is: $" + balance.getAllowedCreditLimit());
		System.out.println("Please enter all of the items charged by the customer this month. Type -1 when finished");
		itemsCharged = object.nextInt();
		
		//loop until sentinel value is read from the user. 
		while(itemsCharged != -1)
		{
			//add each itemCharged to a sum total. Keep track of number of items
			total = total + itemsCharged;
			itemCounter++;
			
			//Prompt for input and read the next item from user
			System.out.println("Please enter all of the items charged by the customer this month. Type -1 when finished");
			itemsCharged = object.nextInt();
			
		}
		itemsCharged++;
		System.out.println("The total for the " + itemCounter + " items is $" + total);
		balance.setCustomerItemsTotal(itemsCharged);
		
		//prompt the user to enter all of the credits and total the amount
		System.out.println("Please enter all of the credits by the customer this month. Type -1 when finished");
		creditTotal = object.nextInt();
		
		//loop until sentinel value is read from the user. 
				while(creditTotal != -1)
				{
					//add each credit to a credit Sum. Keep track of number of credits
					creditSum = creditSum + creditTotal;
					CreditNumber++;
					
					//Prompt for input and read the next credit amount from user
					System.out.println("Please enter all of the items charged by the customer this month. Type -1 when finished");
					creditTotal = object.nextInt();
					
				}
		        creditTotal++;
				System.out.println("The credit total sum is $" + creditSum + " for the combined " + CreditNumber + " credits items.");
				balance.setAllCreditsApplied(creditSum);
				
				balance.newBalance(balance.getCustomerItemsTotal(),balance.getAllCreditsApplied());
				balance.displayNewBalance();
	}
	
	

}
