/**
 * 
 */
package chapterThree;

/**
 * @author jkirkish
 *October 4, 2018
 */
public class GradesTest {
	
	public static void main(String[] args) {
		
		//Declare an object of type Grades
		Grades c = new Grades("Spanish 425", "Ed Gonzales");
		
		//display the course name and instructor name
		c.displayMessage();
		
		//change the course name and Instructor Name
		c.setCourseName("French 125");
		c.setInstructorName("Don Chateau");
		
		//Print out the course name
		System.out.println("\nNew Course..........................................");
		c.displayMessage();
		c.getCourseName();
		
		

	}

}
