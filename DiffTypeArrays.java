/**Feb 10, 2019
 * @author Joseph Kirkish
 */
package chapterSeven;

/**
 * @author jkirkish notice an array is a fix size that is specified which
 *         incorporates a collection of same datatype values. You can also have
 *         an array of the same object type such as an array of 5 strings. The
 *         size of the array is fixed once it is created.
 */
public class DiffTypeArrays {

	// employees array shows a name for each element/this is size 5
	String[] employees = { "Joe", "Michelle", "Chris", "Alberto", "Sarah" };// array initializer list
	boolean[] factChecks = new boolean[5];// array of 5 boolean elements. False is the default value
	char[] gender = { 'M', 'F', 'F', 'M', 'F' }; // an array of characters indicating 'm' for male 'f' for female
	int[] ages = new int[5];// an array of ages of size 5(-2^31 (-2,147,483,648) to 2^31-1 (2,147,483,647) 4
							// Bytes)
	long[] humanWeights = { 250, 423, 228, 111, 45 };// array of size 5 for human weights. using long values(minimum
														// value of -2 '63 and a maximum value of 2'63-1)
	byte[] pageCount = { 33, 44, -58, 0, 54 }; // array of size 5 for pageCount of books using byte(minimum value of
												// -128 and a maximum value of 127 (inclusive).)
	short[] monthlySalary = { 333, 4443, -876, 043, 546 }; // array of size 5 for monthly salary with shorts(6-bit
															// signed two's complement integer. It has a minimum value
															// of -32,768 and a maximum value of 32,767 (inclusive))
	double[] speedLimits = { .567, .987, -984.56, 0, .00987 };// array of size 5 for double value speed limits.(
																// double-precision 64-bit IEEE 754 floating point)
	float[] temperatures = { .467f, .387f, -284.56f, 0.01f, .00387f };// array of size 5 for temperature values of
																		// float(single-precision 32-bit IEEE 754
																		// floating point.)

	// show employees
	public void showEmployees() {
		// output each array element's value
		System.out.printf("%s%20s\n", "Index", "Elements");

		for (int index = 0; index < employees.length; index++) { // print out the values of the array
			System.out.printf("%5s%20s\n", index, employees[index]);
		}
	}

	// show truths and falsehoods of facts
	public void showTruths() {

		// output each array element's value
		System.out.printf("%s%20s\n", "Index", "Elements");

		for (int index = 0; index < factChecks.length; index++) { // print out the values of the array
			System.out.printf("%5s%20s\n", index, factChecks[index]);
		}
	}

	// show the gender
	public void showGender() {

		// output each array element's value
		System.out.printf("%s%20s\n", "Index", "Elements");

		for (int index = 0; index < gender.length; index++) { // print out the values of the array
			System.out.printf("%5s%20s\n", index, gender[index]);
		}
	}

	// show the Ages
	public void showAges() {

		// output each array element's value
		System.out.printf("%s%20s\n", "Index", "Elements");

		for (int index = 0; index < ages.length; index++) { // print out the values of the array
			System.out.printf("%5s%20s\n", index, ages[index]);
		}
	}

	// show the weights
	public void shoWeights() {

		// output each array element's value
		System.out.printf("%s%20s\n", "Index", "Elements");

		for (int index = 0; index < humanWeights.length; index++) { // print out the values of the array
			System.out.printf("%5s%20s\n", index, humanWeights[index]);
		}
	}

	// show the pages
	public void pageCount() {

		// output each array element's value
		System.out.printf("%s%20s\n", "Index", "Elements");

		for (int index = 0; index < pageCount.length; index++) { // print out the values of the array
			System.out.printf("%5s%20s\n", index, pageCount[index]);
		}
	}

	// show the Salaries
	public void monSalaries() {

		// output each array element's value
		System.out.printf("%s%20s\n", "Index", "Elements");

		for (int index = 0; index < monthlySalary.length; index++) { // print out the values of the array
			System.out.printf("%5s%20s\n", index, monthlySalary[index]);
		}
	}

	// show the SpeedLimits
	public void speedLimits() {

		// output each array element's value
		System.out.printf("%s%20s\n", "Index", "Elements");

		for (int index = 0; index < speedLimits.length; index++) { // print out the values of the array
			System.out.printf("%5s%20s\n", index, speedLimits[index]);
		}
	}

	// show the Temperatures
	public void showTemps() {

		// output each array element's value
		System.out.printf("%s%20s\n", "Index", "Elements");

		for (int index = 0; index < temperatures.length; index++) { // print out the values of the array
			System.out.printf("%5s%20s\n", index, temperatures[index]);
		}
	}
}
