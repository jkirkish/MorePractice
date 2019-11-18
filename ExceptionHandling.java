/**Oct 19, 2019
 * @author Joseph Kirkish
 */
package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author jkirkish
 * the program demonstrates throwing an exception when a divide-by -zero occurs
 */
public class ExceptionHandling {

	public static int divide(int numer,int denom)
	throws ArithmeticException
	{
		return numer/denom;//possible division by zero
	}//end method quotient
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		boolean moveLoop = true;//need to determine if more input is needed
		
		do
		{
			try//read two numbers and calculate quotient
			{
				System.out.print("Please enter a whole number numerator: ");
				int num = scanner.nextInt();
				System.out.print("Please enter a whole number denomiator: ");
				int den = scanner.nextInt();
				
				int answer = divide(num,den);
				System.out.printf("\nResult: %d/%d = %d\n", num,den,answer);
				moveLoop = false;
				
			}//end try
			catch(InputMismatchException inputMismatchException)
			{
				System.err.printf("\nException: %s\n", inputMismatchException);
				scanner.nextLine();//discard the input so user can try again
				System.out.println("You must enter integers. Please try again.\n");
			}//end catch
			catch(ArithmeticException arithmeticException)
			{
				System.err.printf("\nException: s\n", arithmeticException);
				System.out.print("Zero is an invalid denominator. Please try again.\n");
			}
		
		}while(moveLoop);
	}

}
