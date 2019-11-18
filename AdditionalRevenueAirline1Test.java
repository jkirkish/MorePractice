/**Aug 1, 2019
 * @author Joseph Kirkish
 */
package chapter9;

import java.math.BigDecimal;

/**
 * @author jkirkish
 *
 */
public class AdditionalRevenueAirline1Test {


	public static void main(String[] args) {
		//String name, int plane, String Id, int staff,BigDecimal money, int quantity, double cost
		//declare class object with has a relationship to AdditionalRevenueAirline1 
		BigDecimal v = new BigDecimal(125000000);
		AdditionalRevenueAirline1 test = new AdditionalRevenueAirline1("Hawaiian Gulfstreams",10,"HAWAII4XD",1000,v,15,250.00);
		System.out.printf("%s\n\n %sNextFormat\n\n %s lastFormat \n\n",test.toString(),test.toUniversalString(),test.superStringExample());
		
		

	}

}
