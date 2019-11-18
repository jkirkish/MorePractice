/**Sep 17, 2019
 * @author Joseph Kirkish
 */
package chapter10;

import java.text.ParseException;
import java.util.Date;

/**
 * @author jkirkish
 *
 */
public class AirlineReservationTest {

	
	public static void main(String[] args) throws ParseException {

		//Assign superclass reference to superclass variable
		SuperReservation reservation = new SuperReservation(" Chris ", "Humberto");
		//"yyyy-mm-dd"
		
		
		//Assign a subclass reference to a subclass variable
		/*AirReservation(String first, String last, String dcity, String aCity, int year, int month, int day, 
			int year1, int month1, int day1, double cost,
			String type)
		 * 
		 */
		AirReservation airReservation = new AirReservation("Joanna","Frost", "New York City", "Honolulu", 119, 05, 17,
				119,6,18,1439.34,
				"Business");
		
		//invoke toString on superclass object using superclass variable 
		System.out.println("\nCall reservation's toString method superclass reference" + reservation.toString());
		
		//invoke toString on subclass object using subclass variable
		System.out.println("\nCall airReservation toString with subclass reference to subclass object" + airReservation.toString());
		
		//invoke toString on subclass object using superclass variable
		SuperReservation reservation2 = airReservation;
		System.out.println("\nCall airReservation's toString method with superclass reference to subclass object" + reservation2.toString());

	}

}
