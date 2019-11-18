/**Feb 13, 2019
 * @author Joseph Kirkish
 */
package chapterSeven;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * @author jkirkish
 *
 */
public class ArrayNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// instance variables
		String name;
		int turn = 1;
		double sum = 0.0;
		int[] values = new int[10];// array of doubles values of size 10

		// Scanner object
		Scanner keyboard = new Scanner(System.in);

		// prompt the user for their name
		System.out.print("Hello, What is your name?");
		name = keyboard.nextLine();
		// prompt the user for their name and greet them.Also introduce the game.
		System.out.println("Greetings! " + name + " Let's play a game together!");
		System.out.println(
				"The object of the game is to input 10 numbers into an array and " + "get the sum. Let's get started.");

		for (int i = 0; i < values.length; i++) {
			// prompt the user to enter 10 values
			System.out.print("Please enter the value in the " + turn + " placeholder. ");
			Scanner input = new Scanner(System.in);
			values[i] = input.nextInt();// input the values into each array index
			turn++;// mark the next iteration
			sum += values[i]; // sum up the values

		}
		// print out the sum of the array values
		System.out.printf("The sum of array placeholders is: %f\n", sum);

		// print out the array values in each index
		System.out.printf("%s%8s\n", "ArrayIndex", "value");
		for (int i = 0; i < values.length; i++) {
			System.out.printf("%5d%8d\n", i, values[i]);
		}

		System.out.println("Array Number Distribution");
		// for each array element, output a bar of the chart
		for (int counter = 0; counter < values.length; counter++) {
			// output bar label
			if (counter == 9)
				System.out.printf("%d: ", 10);
			else
				System.out.printf("%02d: ", counter + 1);

			// show the asterisks bars for each placeholder in the array
			for (int asterisk = 0; asterisk < values[counter]; asterisk++)
				System.out.print("*");

			System.out.println(); // starts a new line to show.
		}
	}
}
