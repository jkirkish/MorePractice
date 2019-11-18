/**Feb 20, 2019
 * @author Joseph Kirkish
 */
package chapterSeven;

/**
 * @author jkirkish
 *
 */
public class SimpleArray {

	public static void main(String[] args) {

		// an array of numbers size 5
		int[] numbers = { 1, 2, 3, 4, 5 };

		// print out the array numbers in each index
		System.out.printf("%s%8s\n", "ArrayIndex", "value");
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%5d%8d\n", i, numbers[i]);
		}

		System.out.println("Array Number Distribution");
		// for each array element, output a bar of the chart
		for (int counter = 0; counter < numbers.length; counter++) {
			// output bar label
			if (counter == 9)
				System.out.printf("%d: ", 10);
			else
				System.out.printf("%02d: ", counter + 1);

			// show the asterisks bars for each placeholder in the array
			for (int asterisk = 0; asterisk < numbers[counter]; asterisk++)
				System.out.print("*");

			System.out.println(); // starts a new line to show.
		}
	}

}
