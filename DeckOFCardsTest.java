/**Feb 22, 2019
 * @author Joseph Kirkish
 */
package chapterSeven;

public class DeckOFCardsTest {

	public static void main(String[] args) {
		// execute application
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();// place Cards in randomOrder

		// print all 52 Cards in the order in which they are dealt
		for (int i = 1; i <= 52; i++) {
			// deal and display a Card
			System.out.printf("%-19s", myDeckOfCards.dealCard());

			if (i % 4 == 0)// output a newLine after every fourth card
				System.out.println();
		} // end for
	}// end main
}// end class
