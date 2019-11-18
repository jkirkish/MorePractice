package chapterSeven;

//Card represents a playing card

public class Card {
	private String face;// face of card
	private String suit;// suit of card

	// two-argument constructor intializes card's face and suit
	public Card(String cardFace, String cardSuit) {
		face = cardFace;// initialize face of card
		suit = cardSuit; // initialize suit of card
	}//end of two-argument constructor
	
	//return String representative of Card
	public String toString()
	{
		return face + " of " + suit;
	}//end of method toString
}//end of class Card