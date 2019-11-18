/**Jul 18, 2019
 * @author Joseph Kirkish
 */
package chapter9;

import java.math.BigDecimal;

/**
 * Class Airline extends class Object. The Airline class sets out to describe
 * the parameters that identify an airline. The parameters in this application
 * are conmpanyName, Number of Employees, number of planes, FAA registry ID and
 * revenue.
 * 
 * @author jkirkish
 *
 */
public class Airline extends Object {

	private String companyName;
	private int NumberOfPlanes;
	private String FaaRegistryID;
	private int NumberOfEmployees;
	private BigDecimal revenue = new BigDecimal(0.00);

	// five argument constructor
	public Airline(String name, int plane, String Id, int staff, BigDecimal money) {
		companyName = name;
		NumberOfPlanes = plane;
		FaaRegistryID = Id;
		setNumberOfEmployees(staff);
		setRevenue(money);
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName
	 *            the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the numberOfPlanes
	 */
	public int getNumberOfPlanes() {
		return NumberOfPlanes;
	}

	/**
	 * @param numberOfPlanes
	 *            the numberOfPlanes to set
	 */
	public void setNumberOfPlanes(int numberOfPlanes) {
		if (numberOfPlanes >= 0)
			NumberOfPlanes = numberOfPlanes;
		else
			throw new IllegalArgumentException("Planes must be more than 0");

	}

	/**
	 * @return the faaRegistryID
	 */
	public String getFaaRegistryID() {
		return FaaRegistryID;
	}

	/**
	 * @param faaRegistryID
	 *            the faaRegistryID to set
	 */
	public void setFaaRegistryID(String faaRegistryID) {
		FaaRegistryID = faaRegistryID;
	}

	/**
	 * @return the numberOfEmployees
	 */
	public int getNumberOfEmployees() {
		return NumberOfEmployees;
	}

	/**
	 * @param numberOfEmployees
	 *            the numberOfEmployees to set
	 */
	public void setNumberOfEmployees(int numberOfEmployees) {
		if (numberOfEmployees >= 0)
			NumberOfEmployees = numberOfEmployees;
		else
			throw new IllegalArgumentException("Staffing level must be " + "greater than 0");
	}

	/**
	 * @return the revenue
	 */
	public BigDecimal getRevenue() {
		return revenue;
	}

	/**
	 * @param revenue
	 *            the revenue to set
	 */
	public void setRevenue(BigDecimal money) {
		revenue = money;

	}

	// return a String format that defines the Airline object for the user
	@Override // indicates that this method overrides a superclass method
	public String toString() {
		return String.format(" %s: %s\n %s: %s planes\n %s: %s\n %s: %s Employees\n %s: $%f", 
				"Airline", companyName, 
				"Fleet", NumberOfPlanes,
				"FAA Registration", FaaRegistryID, 
				"Company size", NumberOfEmployees,
				"Annual Revenue", revenue);
	}//end of method toString
}//end of class
