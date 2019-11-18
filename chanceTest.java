/**Jan 14, 2019
 * @author Joseph Kirkish
 */
package chapterSix;

import java.util.Scanner;

/**
 * @author jkirkish
 *
 */
public class chanceTest {
	

	public static void main(String[] args) {
		
		String answer;
		String player;
		//declare a Scanner Object for input and name
		Scanner input = new Scanner(System.in);
		Scanner name = new Scanner(System.in);
		headsOrTails chance = new headsOrTails();
		
		//Ask the user for their first and last name
		System.out.println("Greetings, Welcome to Heads or Tails!");
		System.out.println("Who do I have the pleasure of playing with?");
		player = name.nextLine();
		chance.setFirstName(player);
		
		//prompt the user if the game is to be played
		System.out.print("Do you want to play the Coin Chance game? Y for YES and N for NO");
		answer = input.nextLine();
		
		chance.CalculateChances();
		
		
		while(answer.equalsIgnoreCase("Y"))
		{
			//prompt the user again
			System.out.print("Do you want to play the Marriage Chance game? Y for YES and N for NO");
			answer = input.nextLine();
			
			
		}//end while
		
	}

}
