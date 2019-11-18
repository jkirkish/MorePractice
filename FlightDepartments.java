/**Oct 4, 2019
 * @author Joseph Kirkish
 */
package chapter10;

/**
 * @author jkirkish
 *
 */
public class FlightDepartments extends CharterCompany{
	
	private String deptName;
	private String function;
	private int numberOfemployees;
	private double budget;
	private double businessTripQuote;
	private double expectedBussinTripHours;
	
	/**
	 * @param name
	 * @param fleet
	 * @param airport
	 * @param pilots
	 */
	public FlightDepartments(String name, int fleet, String airport, int pilots,String dName,
			String purpose ,int supportEmployees,double finance,double quote, double time) 
	{
		super(name, fleet, airport, pilots);
		setFunction(purpose);
		setNumberOfemployees(supportEmployees);
		setBudget(finance);
		setBusinessTripQuote(quote);
		setExpectedBussinTripHours(time);
		setDeptName(dName);
	}
	/* (non-Javadoc)
	 * @see chapter10.CharterFlights#getCharterTripCost()
	 */
	@Override
	public double getCharterTripCost() {
		//find the expected cost of a business trip in a department 
		double amount;
		amount = getBusinessTripQuote() * getExpectedBussinTripHours();
		return amount;
	}
	@Override
	public String toString()
	{
		return String.format("%s%s%s%d%f%f%f",super.toString(),getDeptName(),getFunction(),getNumberOfemployees(),getBudget()
				,getBusinessTripQuote(),getExpectedBussinTripHours());
	}

	/**
	 * @return the function
	 */
	public String getFunction() {
		return function;
	}



	/**
	 * @return the numberOfemployees
	 */
	public int getNumberOfemployees() {
		return numberOfemployees;
	}



	/**
	 * @return the budget
	 */
	public double getBudget() {
		return budget;
	}



	/**
	 * @param function the function to set
	 */
	public void setFunction(String function) {
		this.function = function;
	}



	/**
	 * @param numberOfemployees the numberOfemployees to set
	 */
	public void setNumberOfemployees(int numberOfemployees) {
		this.numberOfemployees = numberOfemployees;
	}



	/**
	 * @param budget the budget to set
	 */
	public void setBudget(double budget) {
		this.budget = budget;
	}
	/**
	 * @return the businessTripQuote
	 */
	public double getBusinessTripQuote() {
		return businessTripQuote;
	}
	/**
	 * @return the expectedBussinTripHours
	 */
	public double getExpectedBussinTripHours() {
		return expectedBussinTripHours;
	}
	/**
	 * @param businessTripQuote the businessTripQuote to set
	 */
	public void setBusinessTripQuote(double businessTripQuote) {
		this.businessTripQuote = businessTripQuote;
	}
	/**
	 * @param expectedBussinTripHours the expectedBussinTripHours to set
	 */
	public void setExpectedBussinTripHours(double expectedBussinTripHours) {
		this.expectedBussinTripHours = expectedBussinTripHours;
	}
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
