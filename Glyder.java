/**Sep 24, 2019
 * @author Joseph Kirkish
 */
package chapter10;

import java.util.Scanner;

/**
 * @author jkirkish
 *A glider is a fixed-wing aircraft that is supported in flight by the 
 *dynamic reaction of the air against its lifting surfaces, and whose 
 *free flight does not depend on an engine.[1] Most gliders do not have
 * an engine, although motor-gliders have small engines for extending their
 *  flight when necessary by sustaining the altitude (normally a sailplane 
 *  is on a continuously descending slope) with some being powerful enough 
 *  to take off self-launch .
 */
public class Glyder extends Aircraft{
	
	//instance variables
	public Glyder(String Air, String Cla, String Fuel) {
		
		super(Air, Cla, Fuel);
	}
	 //return String representation of Glyder Object
	@Override
	public String toString() {

		return String.format("%s%s$%f", super.toString(),"Cost per Hour: ",
				costPerHOur());
	}

	/* (non-Javadoc)
	 * @see chapter10.Aircraft#costPerHOur()
	 */
	@Override
	public double costPerHOur() {
		double cost;
		double mxRate = .17;
		cost = mxRate * 3000;
		return cost;
	}

}
