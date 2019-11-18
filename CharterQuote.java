/**Sep 28, 2019
 * @author Joseph Kirkish
 */
package chapter10;

import java.io.PrintStream;

/**
 * @author jkirkish
 *
 */
public class CharterQuote implements CharterFlights {

	/**This class implements the interface CharterFlights.  The idea is to 
	 * calculate a quote for a flight depending on the costPerHour on what the 
	 * type of aircraft category they want to use. 
	 * 
	 */
	
	private String Departure;
	private String Destination;
	private double flightTime;
	private AirplaneCat airplane;
	private RotorCraft roto;
	private PoweredLift powerLift;
	private Glyder glide;
	private lighterThanAir lightAir;
	private PoweredParachute chute;
	private WeightShiftControl control;
	private double hourlyCost;
	
public CharterQuote() {
		
		AirplaneCat airplane = new AirplaneCat("Citation Longitude","Multi-Engine Land","Jet A","SweptBack","Retractable");
		RotorCraft roto = new RotorCraft("Eurocopter HH-65 Dolphin","Helicopter Multi-Engine","Jet A",4);
		PoweredLift powerLift = new PoweredLift("Bell Boeing V-22 Osprey","Multi-Engine","Jet A",6150);
		Glyder glide = new Glyder("DG Flugzeugbau DG-800","Land","100LL");
		lighterThanAir lightAir = new lighterThanAir("Hot-Air-Ballon","Land","Propane", 100);
		PoweredParachute chute = new PoweredParachute("Powered Parachute Two seater","Land","Jet Fuel",2);
		WeightShiftControl control = new WeightShiftControl("Ultralight","Land","Diesel");
		
	}
	/**
	 * @return the hourlyCost
	 */
	public double getHourlyCost() {
		return hourlyCost;
	}
	/**
	 * @param hourlyCost the hourlyCost to set
	 */
	public void setHourlyCost(double hourlyCost) {
		this.hourlyCost = hourlyCost;
	}
	@Override
	public double getCharterTripCost() {
		
		double cost;
		cost = getFlightTime() * getHourlyCost();
		return cost;
	}
	@Override
	public String toString()
	{
		return String.format("%s%s%s%s%s$%f", "Departure",getDeparture(),"Destination",getDestination(),"Total Trip Cost: ",getCharterTripCost());
	}
	/**
	 * @return the departure
	 */
	public String getDeparture() {
		return Departure;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return Destination;
	}
	/**
	 * @return the flightTime
	 */
	public double getFlightTime() {
		return flightTime;
	}
	/**
	 * @param departure the departure to set
	 */
	public void setDeparture(String departure) {
		Departure = departure;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		Destination = destination;
	}
	/**
	 * @param flightTime the flightTime to set
	 */
	public void setFlightTime(double flightTime) {
		this.flightTime = flightTime;
	}

}
