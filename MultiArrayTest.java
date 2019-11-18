/**Mar 30, 2019
 * @author Joseph Kirkish
 */
package chapterSeven;

import java.util.Scanner;

/**
 * @author jkirkish
 *dataType[][] arrayRefVar
 */
public class MultiArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		multiDimensional multi = new multiDimensional();

		int[][] number = new int[2][2];
		System.out.println("An unitialized array with ints shows zeros");
		multi.showArray(number);

		String[][] nulls = new String[2][2];
		System.out.println("An unitialized array with Strings shows null");
		multi.showArray(nulls);

		boolean[][] truths = new boolean[2][2];
		System.out.println("An unitialized array with booleans shows false");
		multi.showArray(truths);

		char[][] letters = new char[2][2];
		System.out.println("An unitialized array with characters shows characters of '',");
		multi.showArray(letters);

		int[][] numbers = { { 100, 200 }, { 300, 400 }, { 500, 600 } };

		System.out.println("These elements of this two-dimensional array are:");
		System.out.println("numbers[0][0] is: " + numbers[0][0]);
		System.out.println("numbers[0][1] is: " + numbers[0][1]);
		System.out.println("numbers[1][0] is: " + numbers[1][0]);
		System.out.println("numbers[1][1] is: " + numbers[1][1]);
		System.out.println("numbers[2][0] is: " + numbers[2][0]);
		System.out.println("numbers[2][1] is: " + numbers[2][1]);

		multi.showArray(numbers);

		int rows = 0;
		int col = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("How many rows do you want?");
		rows = input.nextInt();

		System.out.print("How many columns do you want?");
		col = input.nextInt();
		int[][] values = new int[rows][col];
		System.out.println("Your array values[rows][cols] is initialized below:");
		multi.initializeArray(values);
		System.out.println("Your array values[rows][cols] is organized below:");
		multi.showArray(values);
		System.out.println("An jagged Array is shown below.");
		multi.jaggedArray();

	}

}
