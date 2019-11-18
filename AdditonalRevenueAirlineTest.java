/**Jul 31, 2019
 * @author Joseph Kirkish
 */
package chapter9;

import java.math.BigDecimal;

/**
 * @author jkirkish
 *
 */
public class AdditonalRevenueAirlineTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//instantiate an AdditionalRevenueAirline object
		BigDecimal value = new BigDecimal(225000000.00);
		AdditionalRevenueAirline addRev = new AdditionalRevenueAirline("UFO Express", 224, "DXT49567W", 4200, value, 4);
		
		//lets see what the airline revenue performance is
		System.out.println("Airline information obtained by accessor methods: \n");
		
		System.out.printf("%s %s\n", "Airline company name is", addRev.getCompanyName());
		System.out.printf("%s %s\n", "Airline fleet size is", addRev.getNumberOfPlanes());
		System.out.printf("%s %s\n", "Airline FAA registry ID is", addRev.getFaaRegistryID());
		System.out.printf("%s %s\n", "Airline employee base", addRev.getNumberOfEmployees());
		System.out.printf("%s $%s\n", "Airline annual ticket sale revenue", addRev.getRevenue());
		System.out.printf("%s %s\n", "Average checked bags per passenger is", addRev.getCheckedBags());
		
		//change the bags to three
		addRev.setCheckedBags(3);
		
		System.out.printf("\n%s\n\n%s\n","Revised Airline information", addRev.toString());
	}

}
