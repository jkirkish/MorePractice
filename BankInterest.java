/**Jan 10, 2019
 * @author Joseph Kirkish
 */
package chapterFive;

/**
 * @author jkirkish
 *I invest $1000,000 in a savings account giving 5% interest.  
 *This program calculates the interest in the amount of money 
 *in the account at the end of the year for 5 years. With this
 *formula. 
 *
 *p original amount
 *r is the annual interest rate
 *n is the number of years
 *a is the amount on deposit at end of nth year
 */
public class BankInterest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double amount;//deposit amount at the end of year
		double principal = 1000000.00;//intial amount
		double rate = 0.05;//interest rate
		
		//display headers
		System.out.printf("%s%20s\n", "Year", "Amount on deposit");
		
		//calculate amont on deposit for each 5 years
		for(int year = 1; year <=5; year++)
		{
			//calculate new amount for that given year
			amount = principal * Math.pow(1.0 + rate, year);
			
			//display the year and the amount
			System.out.printf("%4d%,20.2f\n",year,amount);
		}//end of forloop

	}//end of main

}//end of class
