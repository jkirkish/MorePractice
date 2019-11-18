package chapterTwo;
/*
 * Author Joseph Kirkish
 * July 27th, 1980
 * Write an Application that reads five integers and determines 
 * and prints the larget and smallest
 * integers in the group
 */

import java.util.Scanner;

public class largesttoSmallest {
	
	public static int min(int a, int b) {
	    if(a > b) return b;
	    return a;
	}

	public static int max(int a, int b) {
	    if(a > b) return a;
	    return  b;
	}

	public static void main(String[] args) {
		
		// Scanner Object
				Scanner in = new Scanner(System.in);

				int first; // first number
				int second; // second number
				int third; // third number
				int fourth;// fourth number
				int fifth; // fifth number
				

				// Prompt the user to enter the first value
				System.out.println("Enter the first value?");
				first = in.nextInt();// read value inputed

				// Prompt the user to enter the second value
				System.out.println("Enter the second value?");
				second = in.nextInt();// read value inputed

				// Prompt the user to enter the third value
				System.out.println("Enter the third value?");
				third = in.nextInt();// read value inputed
				
				// Prompt the user to enter the fourth value
				System.out.println("Enter the fourth value?");
				fourth = in.nextInt();// read value inputed
				
				// Prompt the user to enter the fifth value
				System.out.println("Enter the fifth value?");
				fifth = in.nextInt();// read value inputed
				

				
				int minimal = first, maximum = first;

				minimal = min(min( min(first, second) , min(third, fourth)), fifth);
				maximum  = max(max( max(first, second) , max(third, fourth)), fifth);
				
				System.out.println("Smallest " + minimal + " Largest  " + maximum);

	}

}
