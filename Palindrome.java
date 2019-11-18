package chapterFour;
/*A palindrome is a sequence of characters that reads the same backwards
 * as forward. For example, each of the following five-digit integers is 
 * a palidrome: 12321,55555,45554, and 11611. Write an application that 
 * reads in a five-digit integer and determines whether it's a palindrome. 
 * If the number is not five digits long, display an error message and 
 * allow the user to enter a new value.
 * 
 * Joseph Kirkish
 * 
 * Oct, 29, 2018
 * 
 */

import java.util.Scanner;

public class Palindrome {
	
			// instance variable
			private static String forward, backward;
			static Scanner input = new Scanner(System.in);
			// Prompt the user to input a 5 digit number
	public static void fiveDigitInput()
	{
		System.out.println("Enter a Five digit number to see if it is a palindrome");
		// change the String input to a Integer
		forward = input.nextLine();

		// make the input a 5 digit number
		int extent = forward.length();
		int count = 5;
		
		while (count > 0) {
			backward = backward + forward.charAt(count-1);
			count--;
		}
		if (extent != 5) {

			System.err.println("Error, The number is not a 5 digit number." + " Please enter another 5 digit number.");
			fiveDigitInput();
		} else if (forward.equals(backward)) {
			System.out.println("Congrats, this 5-digit number is a palindrome");
		} else {
			System.out.println("Unfortunately, this 5-digit number is NOT a palindrome. " + "Keep practicing");
		}

	}

	public static void main(String[] args) {

		// instance variable
		String forward, backward = "";
		// Scanner object
		Scanner input = new Scanner(System.in);
		// Prompt the user to input a 5 digit number
		System.out.println("Enter a Five digit number to see if it is a palindrome");
		// change the String input to a Integer
		forward = input.nextLine();

		// make the input a 5 digit number
		int extent = forward.length();
		int count = 5;
		
		while (count > 0) {
			backward = backward + forward.charAt(count-1);
			count--;
		}
		if (extent != 5) {

			System.err.println("Error, The number is not a 5 digit number." + " Please enter another 5 digit number.");
			fiveDigitInput();

		} else if (forward.equals(backward)) {
			System.out.println("Congrats, this 5-digit number is a palindrome");
		} else {
			System.out.println("Unfortunately, this 5-digit number is NOT a palindrome. " + "Keep practicing");
		}
		
	}

}
