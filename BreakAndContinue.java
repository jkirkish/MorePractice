/**Jan 11, 2019
 * @author Joseph Kirkish
 */
package chapterFive;

/**
 * @author jkirkish
 *A break statement causes immediate exit from that statement. 
 *Execution continues with the first statement after the control
 *statement. Common uses of the break statement are to escape 
 *early from a loop or to skip the remainder of a switch. 
 */
public class BreakAndContinue {

	public static void Continue(){	

		for(int incrementer1 = 1; incrementer1<=15; incrementer1++)//loop 50 times
		{
			
			if(incrementer1 == 10)//if count is 5. skip remaining code in the loop
				continue;
				
				System.out.printf("%d ", incrementer1);
		}//end for
		
		
		System.out.println("\nNotice that a Continue word makes this for loop skip the number 10");
	}
	
	public static void main(String[] args) {
		
		Continue();
		int incrementer; // control variable
		
		for(incrementer = 0; incrementer<=15; incrementer++)
		{
			if(incrementer == 10)
				break;
			System.out.printf("%d ", incrementer);
		}//end for
		
		
		System.out.printf("\nA break makes this loop Break out of loop at count = %d\n", incrementer);
		
	
	}//end main

}//end class ContinueTest
