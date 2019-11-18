/**Aug 1, 2019
 * @author Joseph Kirkish
 * With inheritance, the common instance variables and method of all the classes
 * in the hierarchy are declared in a superclass. When changes are made for these
 * common features in the superclass-subclasses then inherit the changes. Without
 * inheritance, changes would need to be made to all the source-code files that 
 * contain a copy of the code in question.
 */
package chapter9;

import java.math.BigDecimal;

/**
 * @author jkirkish
 *
 */
public class AdditionalRevenueAirline1 extends AdditionalRevenueAirline{

	//includes the labor cost of airline workers
	private double laborCost;
	
	public AdditionalRevenueAirline1(String name, int plane, String Id, int staff,BigDecimal money, int quantity, double cost) {
		
		//super is a constructor inherited from AdditionalRevenue Airline
		//super statements in code are the first thing listed. Then other code can be added below it
		super(name,plane,Id,staff,money,quantity);
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return laborCost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setLaborCost(double cost) {
		if(cost>= 0.0) 
			 laborCost = cost;
		else
			throw new IllegalArgumentException("Cost must be >=0");
	}//end of method setCost
	//private superclass members cannot be accessed in a subclass
	@Override // indicates that this method overrides a superclass method
	public String toString() {
		return String.format(" %s: %s\n %s: %s planes\n %s: %s\n %s: %s Employees\n %s: $%.2f\n %s: %s\n %s: %s\n %s: %.2f\n", "Airline", getCompanyName(),
				"Fleet", getNumberOfPlanes(), "FAA Registration", getFaaRegistryID(), "Company size", getNumberOfEmployees(),
				"Annual Revenue", getRevenue(),"Baggage Fee", getBaggageFee(), "Avg checked Bags per passenger", getCheckedBags(),"Avg Baggage Total per passenger", BaggageCost());
	}// end of method toString
	
	// return a String format that defines the Airline object for the user
		public String toUniversalString() {
			 return String.format(" %s: %s\n %s: %s planes\n %s: %s\n %s: %s Employees\n %s: $%.2f\n %s: %s\n %s: %s\n %s: %.2f\n", "Airline", companyName,
					"Fleet", NumberOfPlanes, "FAA Registration", FaaRegistryID, "Company size", NumberOfEmployees,
					"Annual Revenue", revenue,"Baggage Fee", BaggageFee, "Avg checked Bags per passenger", checkedBags,"Avg Baggage Total per passenger", BaggageCost());
		}// end of method toString
		//this string method uses the super class to String method
	public String superStringExample()
	{
		return String.format("%s\n %s", "Airline Profile",super.toString());
	}
}
