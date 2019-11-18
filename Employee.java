package chapterThree;

/*Create a class called Employee that includes three instance variables-a first name
 * (type String), a last name(type String) and a monthly salary(double). Provide a constructor
 * that initializes the three instance variables.  Provide a set and a get method for each 
 * instance variable. If the monthly salary is not positive, do not set its value. Write a 
 * test application named EmployeeTest that demonstrates class Employee's capabilities. Create
 * two Employee objects and display each objects yearly salary. Then give each Employee a 10% 
 * raise and display each Employees yearly salary again. 
 * Author Joseph Kirkish	
 * Date 9/21/2018
 */

public class Employee 
{
	//instance variables
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	
	public Employee()
	{
		firstName = "Joseph";
		lastName = "Kirkish";
		monthlySalary = 9000.00;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the monthlySalary
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}
	/**
	 * @param monthlySalary the monthlySalary to set
	 */
	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary < 0.0)
		{
			this.monthlySalary = 0.0;
		}
		else 
		{
		this.monthlySalary = monthlySalary;
		}
	}
	
	
	
	
}
