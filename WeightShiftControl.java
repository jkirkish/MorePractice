/**Sep 24, 2019
 * @author Joseph Kirkish
 */
package chapter10;

import java.util.Scanner;

/**
 * @author jkirkish
 *Weight-shift control (WSC) aircraft means a powered aircraft with a framed pivoting wing and a fuselage
 * controllable only in pitch and roll by the pilot’s ability to change the aircraft’s center of gravity 
 * (CG) with respect to the wing. Flight control of the aircraft depends on the wing’s ability to deform 
 * flexibly rather than on the use of control surfaces.
 */
public class WeightShiftControl extends Aircraft {

	/**
	 * 
	 */
	public WeightShiftControl(String Air, String Cla, String Fuel) {

		super(Air, Cla, Fuel);

	}

	@Override
	public String toString() {

		return String.format("%s%s$%f", super.toString(),"CostPerHour: ",costPerHOur());
	}

	@Override
	public double costPerHOur() {
		double cost;
		double mxRate = .01;
		cost = mxRate * 3000;
		return cost;

	}

}
