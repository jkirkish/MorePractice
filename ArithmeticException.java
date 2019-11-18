/**Oct 7, 2019
 * @author Joseph Kirkish
 */
package chapter11;

import java.util.Scanner;

/**
 * @author jkirkish
 *Java has an Arithmetic Exception handling technique where you can't divide by zero
 *there is also an input mismatch exception if you put in a value that doesn't 
 *correspond with numerical ones for Arithmetic operations
 */
public class ArithmeticException {

	//static method for division 
	public static int divide(int topValue, int bottomValue)
	{
		return topValue/bottomValue;//an error would happen if divided by zero
	}

	public static void main(String[] args) 
	{
		//Declare a Scanner Object
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a integer value");
		int value1 = keyboard.nextInt();
		System.out.println("Enter a Second integer value");
		int value2 = keyboard.nextInt();
		int answer3 = value1/value2;
		System.out.printf("\nAnswer:%d/%d=%d\n", value1,value2,answer3);
		System.out.println("\nThis is what divide looks like when done correctly");
		int answer = divide(55, 5); //should equal 10
		System.out.println("\nAnswer is: " + answer);
		System.out.println("\nThis is what divide looks like when divide by 0");//should give Arithmetic error
		int answer1 = divide(55, 0); //this will produce an ArithmeticException can't divide by zero
		System.out.println("Answer1 is: " + answer1);
		System.out.println("\nThis is what divide looks like when divide by 0");//should give Arithmetic error
		int value = 567; String num = "huh";


	}

}
