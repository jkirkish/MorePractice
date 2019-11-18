/**
 * 
 */
package chapterThree;

/**
 * @author jkirkish
 * October 2, 2018
 * Grade class requirements
 * 1)INclude a String instance variable that represents the name of the course's instructor
 * 2)Provide a set method to change the instructor's name and a get method to retrieve it
 * 3)Modify the constructor to specify two parameters--one for the course name and one for the instructor's name
 * 4)Modify method displayMessage to output the welcome message and course name, followed by " This course is presented by: " 
 * and the instructor's name
 * Use a modified class in a test application that demonstrates the class's new capabilities.
 */
public class Grades {

	private String courseName;
	private String instructorName;
	
	//constructor initializes courseName with String argument
	public Grades(String name,String instructor)
	{
		courseName = name;
		instructorName = instructor;
	}
	
	//method to retrieve the course Name
	public String getCourseName()
	{
		return courseName;
	}
	
	//method to set the course name
	public void setCourseName(String name)
	{
		courseName= name;
	}

	// method to retrieve the Instructor Name
	public String getInstructorName() {
		return instructorName;
	}

	// method to set the instructor name
	public void setInstructorName(String name) {
		instructorName = name;
	}
	//display a welcome message to the Grades user
	public void displayMessage()
	{
		//Modify method displayMessage to output the welcome message and course name, followed by " This course is presented by: " 
		 //* and the instructor's name
		System.out.printf("Welcome to the gradebook for %s!\n%s%s",getCourseName(),"This course is presented by: ",getInstructorName());
	}
}
