/**Feb 28, 2019
 * @author Joseph Kirkish
 */
package chapterSeven;

/**
 * @author jkirkish Multidimensional arrays with two dimensions are often used
 *         to represent tables of values consisting of information arranged in
 *         rows and columns. The first indice represents the element. The second
 *         indice represents the elements column. Multidimensional arrays are
 *         also known as two dimensional arrays. Think of it like a coordinate
 *         system.
 */
public class multiDimensional {

	public void showArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			// loop through the current row
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + ",");
			}
			System.out.println();
		}
	}

	public void showArray(boolean[][] array) {
		for (int row = 0; row < array.length; row++) {
			// loop through the current row
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + ",");
			}
			System.out.println();
		}
	}

	public void showArray(char[][] array) {
		for (int row = 0; row < array.length; row++) {
			// loop through the current row
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + ",");
			}
			System.out.println();
		}
	}

	public void showArray(Object[][] array) {
		for (int row = 0; row < array.length; row++) {
			// loop through the current row
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + ",");
			}
			System.out.println();
		}
	}

	public void initializeArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			// loop through the current row
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = row;
				System.out.print(array[row][col] = row);
			}
		}
	}

	// Java Program to illustrate the jagged array
	public void jaggedArray() {
		// declaring a 2D array with odd columns
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		// initializing a jagged array
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = count++;

		// printing the data of a jagged array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();// new line
		}
	}
}
