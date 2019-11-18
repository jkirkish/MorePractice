package chapterThree;

/*Write a test application named EmployeeTest that demonstrates class Employee's capabilities. Create
 * two Employee objects and display each objects yearly salary. Then give each Employee a 10% 
 * raise and display each Employees yearly salary again. 
 * 
 * Author Joseph Kirkish
 * 
 * Date Sept 21, 2018
 */

public class EmployeeTest {

	public static void main(String[] args) {
		
		//Employee objects
		//Employee1 salary is $9000.00
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
		//monthly salary of employee2 is $6700.00
		employee2.setMonthlySalary(6700.00);
		
		System.out.println("The first employee's yearly salary is: $" + (employee1.getMonthlySalary()*12));
		System.out.println("The second employee's yearly salary is: $" + (employee2.getMonthlySalary()*12));
		
		//calculate the 10% pay raise
		double employeeYearlyRaise1 = (employee1.getMonthlySalary()*12)*1.1;
		double employeeYearlyRaise2 = (employee2.getMonthlySalary()*12)*1.1;
		
		//set the pay raise salary to each respective employee
		employee1.setMonthlySalary(employeeYearlyRaise1);
		employee2.setMonthlySalary(employeeYearlyRaise2);
		
		
		//The new yearly salaries for each employee after the payraises
		System.out.println("The first employee's yearly salary after the pay raise is: $" + (employee1.getMonthlySalary()));
		System.out.println("The second employee's after they pay raise is: $" + (employee2.getMonthlySalary()));
	}

}
