/**Feb 1, 2019
 * @author Joseph Kirkish
 */
package chapterSix;

import java.util.Random;
import java.util.Scanner;

/**
 * @author jkirkish
 *
 */
public class scheduleTest {

	public static void main(String[] args) {

		// identity of the person who is scheduling an appointment
		scheduleAppoint schedule = new scheduleAppoint("Joseph", "Kirkish", 567.54, 'M', "156 Briarbend Blvd", "Powell",
				"OH", 43065);
		System.out.println("What month do you want to schedule your Dental appointment?");
		System.out.println("Enter a number 1-12 representing one of the twelve months during the year.");
		Random month = new Random();
		// prompt the user what month to schedule
		for (int count = 0; count < 55000; count++) {
			
			int value = month.nextInt(13);
			// error check to see if value is between 1 thru 12
			if (value >= 1 && value <= 12) {// if true run this method
				schedule.deterStatus(value);
			} else {
				// prompt user to try again
				System.err.println("You didn't enter a number that was between 1 thru 12. Please start over!");
			}
		}

	}
}
