/**Jul 31, 2019
 * @author Joseph Kirkish
 */
package chapter9;

import java.math.BigDecimal;

/**
 * @author jkirkish
 *
 */
public class AdditionalRevenueAirline{

	/*private instance variables are accessible in the package. It is always best to use 
	 * private instance variables in the superclass so only set and get methods have access
	 * to them.  Private visibility prevents instance variables from unauthorized change in
	 * subclass implementations. Here protected status is demonstrated to show how this superclass
	 * allows a subclass to access them.
	*/
	protected String companyName;
	protected int NumberOfPlanes;
	protected String FaaRegistryID;
	protected int NumberOfEmployees;
	protected BigDecimal revenue = new BigDecimal(0.00);
	protected int BaggageFee;
	protected int checkedBags;
	protected double bagCostTotal;

	// seven argument constructor
	public AdditionalRevenueAirline(String name, int plane, String Id, int staff, BigDecimal money, int quantity) {
		
		
		companyName = name;
		NumberOfPlanes = plane;
		FaaRegistryID = Id;
		NumberOfEmployees = staff;
		revenue = money;
		BaggageFee = 30;
		setCheckedBags(quantity);
		bagCostTotal = 0.00;

		
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
	public void setRevenue(BigDecimal revenue) {
		this.revenue = revenue;
	}

	/**
	 * @return the baggageFee
	 */
	public int getBaggageFee() {
		return BaggageFee;
	}

	/**
	 * @param baggageFee
	 *            the baggageFee to set
	 */
	public void setBaggageFee(int baggageFee) {
		BaggageFee = baggageFee;
	}

	/**
	 * @return the checkedBags
	 */
	public int getCheckedBags() {
		return checkedBags;
	}

	/**
	 * @param checkedBags
	 *            the checkedBags to set
	 */
	public void setCheckedBags(int checkedBags) {
		if (checkedBags >= 0)
			this.checkedBags = checkedBags;
		else
			throw new IllegalArgumentException("Bags must be 0 or more");
	}
	
	//calculate baggage cost
	public double BaggageCost()
	{
		return this.bagCostTotal = this.checkedBags * this.BaggageFee;
		
	}

	// return a String format that defines the Airline object for the user
	@Override // indicates that this method overrides a superclass method
	public String toString() {
		return String.format(" %s: %s\n %s: %s planes\n %s: %s\n %s: %s Employees\n %s: $%.2f\n %s: %s\n %s: %s\n %s: %.2f\n", "Airline", companyName,
				"Fleet", NumberOfPlanes, "FAA Registration", FaaRegistryID, "Company size", NumberOfEmployees,
				"Annual Revenue", revenue,"Baggage Fee", BaggageFee, "Avg checked Bags per passenger", checkedBags,"Avg Baggage Total per passenger", BaggageCost());
	}// end of method toString
}// end of class
