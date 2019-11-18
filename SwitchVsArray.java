/**Feb 20, 2019
 * @author Joseph Kirkish
 */
package chapterSeven;

import java.util.Random;

/**
 * @author jkirkish
 *
 */
public class SwitchVsArray {

	
	public void SwitchVotes() {
		System.out.println("________________________________________________________________________________________\n Switch");
		// random number generator
		Random ran = new Random();

		// politicians starting out with zero votes
		int politican1 = 0;
		int politican2 = 0;
		int politican3 = 0;
		int politican4 = 0;
		int classificationNumber; // There are 4 politicians classified 1,2,3,4
		// there are 1000000 voters to account for; voting for each politican
		for (int votes = 1; votes <= 10000000; votes++) {
			classificationNumber = 1 + ran.nextInt(4);// determine which politican to vote for

			switch (classificationNumber) {
			case 1:
				++politican1;
				break;
			case 2:
				++politican2;
				break;
			case 3:
				++politican3;
				break;
			case 4:
				++politican4;
				break;
			}// end of case statement
		} // end of for loop

		System.out.println("Politican\tVotes");
		System.out.printf("1Donald Trump\t%d\n2Bernie Sanders\t%d\n3Kamala Harris\t%d\n4Joe Biden\t%d\n", politican1,
				politican2, politican3, politican4);
	}

	public void ArrayVotes() {
		System.out.println(
				"________________________________________________________________________________________\n Array");

		// random number generator
		Random ran = new Random();

		String[] names = {"Donald Trump","Bernie Sanders","Kamala Harris","Joe Biden"};
		int [] politicians = new int[5];
		// each index designates a number associated with a politician
		
		// there are 1000000 voters to account for; voting for each politican
		for(int vote = 1; vote <= 10000000;vote++)
		{
			++politicians[1 + ran.nextInt(4)];
		}
		
		
		System.out.printf("%s\t%s\n", "Politician", "Votes");

		for (int politician = 1; politician < politicians.length; politician++)
			System.out.printf("%d%s\t%d\n", politician,names[politician-1], politicians[politician]);
	}//end of method

}//end of class
