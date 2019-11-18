package chapterFour;
/*Determine the output of for each of the given sets of code
 * when x is 9 and y is 11 and when x is 11 and y is 9.  The compiler
 * should ignore the indentation in a Java Program. Also, the 
 * Java compiler always associates an else with the immediately 
 * preceding if unless told to do otherwise by the placement
 * of brackets.  
 * 
 * Joseph Kirkish
 * 
 * October 27th, 2018
 * 
 */
public class DanglingElseWithBrackets {
	
	public static void main(String[] args) {
		
		int x = 11;
		int y = 9;
		
		if(x<10)
		{
			if(y > 10)
				System.out.println("******");
		}
		else
			{
				System.out.println("#####");
				System.out.println("$$$$$");
			}

	}

}