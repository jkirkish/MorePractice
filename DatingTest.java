/**Sep 18, 2019
 * @author Joseph Kirkish
 */
package chapter10;

import java.util.Date;

/**
 * @author jkirkish
 *Test out the CalendarDate class
 */
public class DatingTest {
	
	
	
	

	public static void main(String[] args) {
		
		CalendarDates date = new CalendarDates(0, 0, 0); 
		
		System.out.println("Constructor date is: " + date.toString());
		System.out.println("Current date is: " + date.getCurrentDate());
		date.setDate(121, 6, 30);
		System.out.println("after Setting date is July 30, 2021: " + date.toString());

	}

}
