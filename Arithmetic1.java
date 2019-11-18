package chapterTwo;

import java.util.Scanner;

/*Author Joseph Kirkish
 * Date 07/24/2018
 * Write an application tha asks the user to enter two integers
 * obtains them from the user and prints their sum, product, difference, 
 * quotient(division) 
 */

public class Arithmetic1 {

	public static void main(String[] args) 
	{
		//Scanner Object 
		Scanner in = new Scanner(System.in);
		
		int first; //first number 
		int second; // second number
		int r1, r2, r3,r4;//result answer we get from math output
		
		
		//Prompt the user to enter the first value
		System.out.println("Enter the first value?");
		first = in.nextInt();//read value inputed 
	     
		//Prompt the user to enter the second value
		System.out.println("Enter the second value?");
		second = in.nextInt();//read value inputed 
		
		r1 = first + second;//addition
		r2 = first - second;//subtraction
		r3 = first * second;//multiplication
		r4 = first / second;//division
		
		System.out.printf("Addition is %d\n", r1);
		System.out.printf("Subtraction is %d\n", r2);
		System.out.printf("Multiply is %d\n", r3);
		System.out.printf("Division is %d\n", r4);
	
	}//end of main method

}// end of class
