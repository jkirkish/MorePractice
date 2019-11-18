package chapterTwo;

import java.util.Scanner;

/*Author Joseph Kirkish
* Date 07/24/2018
* Write an application that inputs three integers from the user and displays the sum, average
* product, smallest to largest of the numbers. using only if statements
*/
public class SmallestToLargest {

	public static void main(String[] args) {
		// Scanner Object
		Scanner in = new Scanner(System.in);

		int first; // first number
		int second; // second number
		int third; // third number
		int low = 0;
		int med = 0;
		int high = 0;

		// Prompt the user to enter the first value
		System.out.println("Enter the first value?");
		first = in.nextInt();// read value inputed

		// Prompt the user to enter the second value
		System.out.println("Enter the second value?");
		second = in.nextInt();// read value inputed

		// Prompt the user to enter the third value
		System.out.println("Enter the third value?");
		third = in.nextInt();// read value inputed

		int sum = first + second + third; // sum
		int average = sum / 3;// average of all the user input
		int product = first * second * third; // multiplication of user values

		System.out.printf("\nsum = %d\n", sum);
		System.out.printf("Product = %d\n", product);
		System.out.printf("average = %d\n", average);

		// when sum, product or average equal each other
		if (sum == average)
			System.out.printf("%dsum == %daverage\n", sum, average);
		if (sum == product)
			System.out.printf("%dsum == %dproduct\n", sum, product);

		// when sum, product or average do not equal each other
		if (sum != average)
			System.out.printf("%dsum != average%d\n", sum, average);
		if (sum != product)
			System.out.printf("%dsum != product%d\n", sum, product);

		// when sum, product, average is less than the other
		if (sum < average)
			System.out.printf("%dsum <%a veraged\n", sum, average);
		if (sum < product)
			System.out.printf("%dsum < product%d\n", sum, product);

		// when sum, product, average is greater than the other
		if (sum > average)
			System.out.printf("%dsum > average%d\n", sum, average);
		if (sum > product)
			System.out.printf("%dsum > product%d\n", sum, product);

		// when sum, product, average is greater than or equal to the other
		if (sum >= average)
			System.out.printf("%dsum >= average%d\n", sum, average);
		if (sum >= product)
			System.out.printf("%dsum >= product%d\n", sum, product);

		// when sum, product, average is less than or euqal to the other
		if (sum <= average)
			System.out.printf("%dsum <= average%d\n", sum, average);
		if (sum <= product)
			System.out.printf("%dsum <= product%d\n", sum, product);

		if (sum > average) {
			int temp = sum;
			sum = average;
			average = temp;
		}
		if (average > product) {
			int temp = average;
			average = product;
			product = temp;
		}
		if (sum > average) {
			int temp = sum;
			sum = average;
			average = temp;
		}
		System.out.println("The sorted numbers are " + sum + "," + average + "," + product);

	}// end of main method

}// end of class body
