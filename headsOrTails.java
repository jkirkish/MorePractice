/**Jan 14, 2019
 * @author Joseph Kirkish
 */
package chapterSix;

import java.util.Random;

/**
 * @author jkirkish
 *
 */
public class headsOrTails {

	//instance variable
	private String firstName; 
	private String lastName;
	

	//this is first constructor 
	public headsOrTails()
	{
		firstName = "";
		lastName = "";
	}
	
	//this is second constructor
	public headsOrTails(String first, String last)
	{
		firstName = first;
		lastName = last;
	}
	//set first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
    //get first name
	public String getFirstName() {
		return firstName;
	}
   //getlast name
	public String getLastName() {
		return lastName;
	}
    //setLast name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void CalculateChances()
	{
		//declare random object
		Random chance = new Random();
		
		int ocurrence1 = 0;  //frequency for heads 
		int occurence2 = 0; // frequency for tails
		
		int toss;//result of coin toss
		
		//tally up all of the counts for 1000 coin tosses
		for(int coinToss = 1; coinToss <= 1000; coinToss++)
		{
			toss = 1 + chance.nextInt(2); //2 possibilities accounting for either heads or tails.
			
			switch(toss)
			{
			case 1: 
				++ocurrence1;
				break;
			case 2:
				++occurence2;
				break;
			}//end of switch statement
		}//end of for loop
		
		System.out.println("Coin Side\tOccurrence"); //output headers of results
		System.out.printf("Heads\t\t%d\nTails\t\t%d\n", ocurrence1,occurence2);
	}
	
}
