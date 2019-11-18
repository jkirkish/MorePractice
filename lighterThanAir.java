/**Sep 24, 2019
 * @author Joseph Kirkish
 */
package chapter10;

import java.util.Scanner;

/**
 * @author jkirkish
 *An aerostat is a lighter than air aircraft 
 *that gains its lift through the use of a buoyant gas. Aerostats include unpowered balloons and powered airships.
 * A balloon may be free-flying or tethered. The average density of the craft is lower than the density of atmospheric
 *  air, because its main component is one or more gasbags, a lightweight skin containing a lifting gas to provide 
 *  buoyancy, to which other components such as a gondola containing equipment or people are attached.[1][2] Especially
 *   with airships, the gasbags are often protected by an outer envelope.
 */
public class lighterThanAir extends Aircraft{

	private int gas;
	
	
	public lighterThanAir(String Air, String Cla, String Fuel, int gas1) {
		super(Air, Cla, Fuel);
		setGasCapacity(gas1);
	}

	/**
	 * @return the gasType
	 */
	public int getGasCapacity() {
		return gas;
	}

	/**
	 * @param gasType the gasType to set
	 */
	public void setGasCapacity(int capacity) {
		this.gas = capacity;
	}

	// return String representation of lighterThanAir Object
		@Override
		public String toString() {

			return String.format("%s%s%dg\n%s$%f", super.toString(),"Gas Capacity: ",getGasCapacity(),"CostPerHour: ",costPerHOur());
		}
	/* (non-Javadoc)
	 * @see chapter10.Aircraft#costPerHOur()
	 */
	@Override
	public double costPerHOur() {
		double cost;
		double mxRate = .02;
		cost = mxRate * 3000;
		return cost;
	}

}
