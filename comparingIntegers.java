package chapterTwo;
/*Author Joseph Kirkish
 * Date 07/24/2018
 * Write an application that asks the user to enter two integers, obtains
 * them from the user and displays the larger number followed by the words
 * "is larger." If the numbers are equal, print the message " These are equal".
 */

import java.util.Scanner;

public class comparingIntegers {

	//main method begins execution of Java Application
	public static void main(String[] args) {
		
		//Scanner Object 
		Scanner in = new Scanner(System.in);
		
		int first; //first number 
		int second; // second number
		
		//Prompt the user to enter the first value
		System.out.println("Enter the first value?");
		first = in.nextInt();//read value inputed 
	     
		//Prompt the user to enter the second value
		System.out.println("Enter the second value?");
		second = in.nextInt();//read value inputed 
		
		if(first == second)
			System.out.println("These values are equal");
		if(first>second)
			System.out.printf("%d first value is larger than second value %d", first,second);
		if(second>first)
			System.out.printf("%d second value, is larger than first value %d", second,first);

	}

}
