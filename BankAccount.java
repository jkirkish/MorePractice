package chapterThree;
/**
 * Provide a method called debit that withdraws money from an Account. Ensure 
 * the debit amount does not exceed Account.  If it does, the balance should be
 * left unchanged and the method should print a message indicating "Debit amount 
 * exceeded account balance." Modify class AccountTest to test method debit. 
 * @author jkirkish
 *08/07/2018
 */
public class BankAccount
{
	private double balance; //instance variable for Bank Account Balance
	
	//constructor
	public BankAccount(double startBalance)
	{
		//make sure startBalance is greater than nothing
		//if false, balance is initialized to be at zero
		if(startBalance > 0.0)
		{
			balance = startBalance;
		}//constructor ends
	}
	//credit (add) an amount to the account
		public void deposit(double deposit)
		{
			balance = balance + deposit;//add the deposit to balance
		}//end method deposit
	
	//return the account balance
		public double getBalance()
		{
			return balance;//shows the value of balance to the calling method
		}//end method getBalance
	//withdraw (substract) an amount from the account
		public void debit(double withdrawal)
		{
			//debit cannot happen if it is greater than available balance
			if(withdrawal>balance)
			{
				System.out.println("Debit amount exceeded account balance.");
			}
			//debit can be subtracted if it is less than balance
			if(withdrawal<balance)
				balance = balance - withdrawal;
		}//end method of debit
}
	

