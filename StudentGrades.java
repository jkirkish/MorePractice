package chapterFour;

import java.util.Random;


/*The user puts in student grades to evaluate whether or not they passed
 * Author Joseph Kirkish
 * Date November 2, 2018
 * 
 */

public class StudentGrades {

	public static void main(String[] args) {
		
		//Score value is a number the user inputs
		int Score = 0;
		int students = 0;
		String Grade;
		Random number = new Random();//declare random to get random scores
		
		//while loop repetition to cycle through the students
		while(students <= 100) {
		//random generate a score
		Score = number.nextInt(100);
		//evaluate if the score is a pass/fail
		Grade = (Score <=100 && Score >=60 ? "Passed" : "Fail");
		
        //print out the results
		System.out.println("Student " + students +": "+ "Score: "+ Score + "% "+Grade);
		students++;// increment to the next student
	}
	}
}
