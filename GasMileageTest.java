package chapterFour;

import java.util.Scanner;

/*Drivers are concerned with the mileage their automobiles get. 
*One driver has kept track of several trips by recording the miles
*driven and gallons used for each tankful. Develop a Java application
*that will input the miles driven and gallons used (both as integers)
*for each trip, The program should calculate and display the miles per
*gallon obtained for each trip and print the combined miles per gallon
*obtained for all trips up to this point. All averaging calculations 
*should produce floating-point results.  Use class Scanner and sentinel
*controlled repetition to obtain the data from the user. 
*/
public class GasMileageTest {

	public static void main(String[] args) {

		// Scanner objects
		Scanner inputMiles = new Scanner(System.in);
		Scanner inputGallons = new Scanner(System.in);
		// GasMileage object
		int milesDriven;
		int gallonsUsed;
		double mpg;
		double cmpg = 0; // combined miles per gallon
		int trip = 0;
		double average = 0;

		// Prompt the user to input the mileDriven
		System.out.print("Enter miles driven or -1 to quit");
		milesDriven = inputMiles.nextInt();
        
		// Prompt the user to input the gallons Used
		System.out.print("Enter gallons used:");
		gallonsUsed = inputGallons.nextInt();

		while (milesDriven != -1) {
			trip++;
			// miles per gallon for each trip
			mpg = milesDriven / gallonsUsed;
			System.out.println("Your " + trip + " trip had an MPG of " + mpg);
			System.out.print("Enter miles driven or -1 to quit");
			milesDriven = inputMiles.nextInt();
			// gallons used for each trip
			if (milesDriven != -1) {
				System.out.print("Enter gallons used:");
				gallonsUsed = inputGallons.nextInt();
			}
			cmpg = cmpg = mpg;

		}
		// print the combined miles per gallon
		// obtained for all trips up to this point.
		average = (cmpg / trip);
		System.out.println("The combined miles per gallon obtained from all trips is: " + average);
	}

}
