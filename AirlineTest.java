/**Jul 25, 2019
 * @author Joseph Kirkish
 */
package chapter9;

import java.math.BigDecimal;

/**
 * @author jkirkish
 *
 */
public class AirlineTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//instantiate an Airline object
		BigDecimal value = new BigDecimal(225000000.00);
		Airline spaceShips = new Airline("UFO Express", 224, "DXT49567W", 4200, value);
		
		System.out.println("Airline Profile");
		System.out.println("______________");
		System.out.println(spaceShips.toString());
		
		
	}

}
