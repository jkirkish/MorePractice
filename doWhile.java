/**Jan 10, 2019
 * @author Joseph Kirkish
 */
package chapterFive;

import java.util.Random;

/**
 * @author jkirkish
 *
 */
public class doWhile {

	public static void main(String[] args)
	{
		Random c = new Random();
		int counter = 1; //initialize counter
		System.out.print("So, how are first impressions on the new job?\n");
		do
		{
			
			int happyMeter = c.nextInt(100);
			if(happyMeter > 50)
			{
				System.out.println("Subject " + counter + " I am Excited to be here!!");
			}
			else
			{
				System.out.println("Subject " + counter + " Life sucks, Am I free to go?");
			}
			++counter;
			
		}while(counter <=5);//end do..while
			
	System.out.println();		

	}

}
