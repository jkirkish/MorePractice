package chapterFour;
/*Determine the output of for each of the given sets of code
 * when x is 9 and y is 11.  The compiler
 * should ignore the indentation in a Java Program. Also, the 
 * Java compiler always associates an else with the immediately 
 * preceding if unless told to do otherwise by the placement
 * of brackets.  
 * 
 * Joseph Kirkish
 * 
 * Oct. 27th, 2018
 */
public class DanglingElseProblem{
		
	
	public static void main(String[] args) {
		
		int x = 9;
		int y = 11;
		
		if(x<10)
			if(y > 10)
				System.out.println("******");
			else 
				System.out.println("#####");
				System.out.println("$$$$$");

	}

}
