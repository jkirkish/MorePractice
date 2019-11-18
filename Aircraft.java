/**Sep 24, 2019
 * @author Joseph Kirkish
 */
package chapter10;

/**
 * @author jkirkish
 *
 */
public abstract class Aircraft {

	/**
	 * An abstract version of an aircraft
	 */
	// characteristics of an Aircraft
	private String AirCategory;// Airplane, rotorcraft, powered lift, glider, lighter than air, powered
								// parachute, weight-shift control
	private String Class1; // Land or sea, helicopter or gyroplane, airship or balloon
	private String fuelType; // ROcket fuel, Jet fuel, Electric

	// three-argument constructor
	public Aircraft(String Air, String Cla, String Fuel) {
		AirCategory = Air;
		Class1 = Cla;
		fuelType = Fuel;
	}

	/**
	 * @return the airCategory
	 */
	public String getAirCategory() {
		return AirCategory;
	}

	/**
	 * @return the class
	 */
	public String getClas() {
		
		return Class1;
	}

	/**
	 * @return the fuelType
	 */
	public String getFuelType() {
		return fuelType;
	}

	/**
	 * @param airCategory
	 *            the airCategory to set
	 */
	public void setAirCategory(String airCategory) {
		AirCategory = airCategory;
	}

	/**
	 * @param class1
	 *            the class to set
	 */
	public void setClass(String class1) {
		Class1 = class1;
	}

	/**
	 * @param fuelType
	 *            the fuelType to set
	 */
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	// return String representation of Aircraft Object
	@Override
	public String toString() {

		return String.format("%s%s\n%s%s\n%s%s\n", "This aircraft is: ", getAirCategory(),"Class: ", getClas(),"FuelType: ", getFuelType());
	}

	// abstract method overriden by concrete subclasses
	public abstract double costPerHOur();

}

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				


				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			