/**Sep 24, 2019
 * @author Joseph Kirkish
 */
package chapter10;

import java.util.Scanner;

/**
 * @author jkirkish A rotorcraft or rotary-wing aircraft[1] is a
 *         heavier-than-air flying machine that uses lift generated by wings,
 *         called rotary wings or rotor blades, that revolve around a mast.
 *         Several rotor blades mounted on a single mast are referred to as a
 *         rotor. The International Civil Aviation Organization (ICAO) defines a
 *         rotorcraft as "supported in flight by the reactions of the air on one
 *         or more rotors".[2] Rotorcraft generally include those aircraft where
 *         one or more rotors are required to provide lift throughout the entire
 *         flight, such as helicopters, autogyros, and gyrodynes. Compound
 *         rotorcraft may also include additional thrust engines or propellers
 *         and static lifting surfaces.
 */
public class RotorCraft extends Aircraft {

	// instance variables
	private int rotorBlades;

	public RotorCraft(String Air, String Cla, String Fuel, int blades) {

		// notice a helicopter class is either a Gyroplane or helicopter
		super(Air, Cla, Fuel);
		setRotorBlades(blades);

	}

	/**
	 * @return the rotorBlades
	 */
	public int getRotorBlades() {
		return rotorBlades;
	}

	// return String representation of Rotorcraft Object
	@Override
	public String toString() {

		return String.format("%s%s% d\n%s$%f", super.toString(), "Number of RotorBlades:", getRotorBlades(),
				"Cost Per Hour: ", costPerHOur());
	}

	/**
	 * @param rotorBlades
	 *            the rotorBlades to set
	 */
	public void setRotorBlades(int rotorBlades) {
		this.rotorBlades = rotorBlades;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see chapter10.Aircraft#costPerHOur()
	 */
	@Override
	public double costPerHOur() {
		double cost;
		double mxRate = .42;
		cost = mxRate * 3000;
		return cost;

	}

}
