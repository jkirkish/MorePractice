/**Sep 29, 2019
 * @author Joseph Kirkish
 */
package chapter10;

/**
 * @author jkirkish
 *
 */
public abstract class CharterCompany implements CharterFlights{
	
	private String companyName;
	private int fleetSize;
	private String airportHomeBase;
	private int NumberOfPilots;
	
	//four argument constructor
	public CharterCompany(String name, int fleet, String airport, int pilots) 
	{
		companyName = name;
		fleet = fleetSize;
		airportHomeBase = airport;
		NumberOfPilots = pilots;		
	}
	
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @return the fleetSize
	 */
	public int getFleetSize() {
		return fleetSize;
	}
	/**
	 * @return the airportHomeBase
	 */
	public String getAirportHomeBase() {
		return airportHomeBase;
	}
	/**
	 * @return the numberOfPilots
	 */
	public int getNumberOfPilots() {
		return NumberOfPilots;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @param fleetSize the fleetSize to set
	 */
	public void setFleetSize(int fleetSize) {
		this.fleetSize = fleetSize;
	}
	/**
	 * @param airportHomeBase the airportHomeBase to set
	 */
	public void setAirportHomeBase(String airportHomeBase) {
		airportHomeBase = airportHomeBase;
	}
	/**
	 * @param numberOfPilots the numberOfPilots to set
	 */
	public void setNumberOfPilots(int numberOfPilots) {
		NumberOfPilots = numberOfPilots;
	}
	//return String representation of a CharterCompany object
	@Override
	public String toString()
	{
		return String.format("%s%d%s%d",getCompanyName(),getFleetSize(),getAirportHomeBase(), getNumberOfPilots());
	}
	//this class does not implement CharterFlights method getCharterTripCost(). Therefore, this class is declared
	//abstract to avoid a compilation error
}//end of abstract class
