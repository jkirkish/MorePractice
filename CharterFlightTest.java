/**Oct 4, 2019
 * @author Joseph Kirkish
 */
package chapter10;

/**
 * @author jkirkish
 *Tests interface CharterFlights
 */
public class CharterFlightTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//Create a four-element Charter Flight array
		CharterFlights [] flights = new CharterFlights[4];
		
		//populate the array with implementable CHarter Flight array
		flights[0] = new CharterQuote();
		flights[1] = new FlightDepartments("NetJets", 500, "KCMH", 1500 ,"Owner Services",
				"Customer Service" ,175,19000000,60000, 9.7);
		flights[2] = new CharterQuote();
		flights[3] = new FlightDepartments("NetJets", 500, "KCMH", 1500 ,"Flight Dispatch",
				"Flight Following" ,50,5000000,240034, 3.5);
		
		
		System.out.println("CharterQuotes and Flight Departments processed polymorphically;\n");
		
		//generically process each element in array flights
		for(CharterFlights quotes : flights)
		{
			//output 
			System.out.printf("%s \n:%s: $%f\n", quotes.toString(),"Quotes Estimate: ",quotes.getCharterTripCost());
		}
	}

}
