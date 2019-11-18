/**Sep 24, 2019
 * @author Joseph Kirkish
 */
package chapter10;

import java.util.Scanner;

/**
 * @author jkirkish
 * A powered parachute, often abbreviated PPC, and also called a motorized parachute or paraplane, is a type of aircraft
 * that consists of a parachute with a motor and wheels. The aircraft's airspeed is typically about 25–35 mph (40–60 km/h). 
 * PPCs operate safely at heights ranging from a few feet off the ground (while ground skimming, a popular use of the aircraft) 
 * to altitudes as high as 10,000+ ft (5.5 km), but typical operating heights are between 500 and 1500 feet (150–500 meters) 
 * above ground level (AGL). Equipped with a standard 5 or 10 gallon fuel tank, PPCs can typically be flown for about three 
 * hours before requiring refueling. They have very short take-off and landing rolls, sometimes less than 100 ft (30 m). PPCs 
 * are among the least expensive aerial vehicles. A new one-person powered parachute may cost as little as $10,000, though 
 * double-seaters more typically cost about $20,000. Top end two-seater PPCs usually cost $25,000–$35,000. Empty weight is 
 * typically around 200–300 lb (90–135 kg) and payload can be upwards of 500 lb (225 kg).
 */
public class PoweredParachute extends Aircraft{

	//instance variables
	private int numberOfSeats;
	
	public PoweredParachute(String Air, String Cla, String Fuel, int Seats) {
		
		super(Air, Cla, Fuel);
		setNumberOfSeats(Seats);
	
	}

	/**
	 * @return the numberOfSeats
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * @param numberOfSeats the numberOfSeats to set
	 */
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	// return String representation of Powered Parachute Object
	@Override
	public String toString() {

		return String.format("%s%s%d\n%s$%f", super.toString(),"Seats: ", getNumberOfSeats(),"CostPerHour: ", costPerHOur());
	}
	/* (non-Javadoc)
	 * @see chapter10.Aircraft#costPerHOur()
	 */
	@Override
	public double costPerHOur() {
		double cost;
		double mxRate = .015;
		cost = mxRate * 3000;
		return cost;
	}

}
