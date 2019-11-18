/**Sep 24, 2019
 * @author Joseph Kirkish
 */
package chapter10;

import java.util.Scanner;

/**
 * @author jkirkish
 *Powered-lift means a heavier-than-air aircraft capable of vertical takeoff, vertical landing, and 
 *low speed flight that depends principally on engine-driven lift devices or engine thrust for lift
 * during these flight regimes and on nonrotating airfoil(s) for lift during horizontal flight.
 */
public class PoweredLift extends Aircraft{

	
	//instance variables
	private int horsePower;
	
	public PoweredLift(String Air, String Cla, String Fuel, int Power)
	{
		super(Air, Cla, Fuel);
		setHorsePower(Power);
	}

	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	 //return String representation of PoweredLift Object
	@Override
	public String toString() {

		return String.format("%s%s%d\n%s$%f", super.toString(),"Horse Power: ",getHorsePower(), "CostPerHour: ",costPerHOur());
	}

	/* (non-Javadoc)
	 * @see chapter10.Aircraft#costPerHOur()
	 */
	@Override
	public double costPerHOur() {
		double cost;
		double mxRate = .65;
		cost = mxRate * 3000;
		return cost;
	}
}
