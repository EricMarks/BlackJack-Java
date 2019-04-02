package Week6;
import java.util.ArrayList;


import Week6.Card;
import Week6.Deck;
import Week6.HandTest;
import Week6.PCard;
import Week6.PHand;

public class Hand implements PHand {
	//Creates an object Array of PCards
	private ArrayList<PCard> hand;
	
	/** Creates the Hand of cards*/
	public Hand() {
		hand = new ArrayList<PCard>();
	}
	
	/** Returns the size of the Hand*/
	@Override
	public int getSize() {
		return hand.size();
	}
	
	/** Adds a new card to the Hand */
	@Override
	public void addCard(PCard card) {
		hand.add(card);
	}
	
	/** Returns the card at a certain index */
	@Override
	public PCard getCard(int index) {
		return hand.get(index);
	}
	
	/** Removes a card from the hand at int i*/
	@Override
	public PCard removeCard(int index) {
		return hand.remove(index);
	}
	
	/** Calculates the value of the hand including Aces as 1 and 11 */
	@Override
	public int getValue() {
		int score = 0;
		int cards = getSize();
		boolean ace = false;
		for(int i = 0; i < cards; i++) {
			PCard card;
			int cardsValue;
			card = getCard(i);
			cardsValue = ((Card) card).getRank();
			
			if (cardsValue > 10) {
				cardsValue = 10;
			}
			if (cardsValue == 1) {
				ace = true;
				cardsValue = 1;
			}
			score = score + cardsValue;
		}
		if (ace == true && score + 10 <= 21) 
			score = score + 10;
			
		
		return score;
	}

	/** Main method that runs the program*/
	public static void main(String[] args) {

		Deck deck = new Deck();
		Hand hand = new Hand();
		
		
		//CardTest.run(card);
		//DeckTest.run(deck);
		HandTest.run(deck, hand);
	}
}



