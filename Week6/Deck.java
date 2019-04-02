/*
Program/Project: Assignment 6
Name: Eric Marks
Date: 6/19/2017
Description: Deck with Functionality
*/

package Week6;
import java.util.ArrayList;
import java.util.Collections;

import Week6.Card;
import Week6.PDeck;
import Week6.PCard;


//Creates a deck object that implements the PDeck interface
public class Deck implements PDeck{
	//this creates an object Array of the object Cards
	private ArrayList<PCard> deck;
	
	public Deck() {
		deck = new ArrayList<PCard>(56);
		for (int i = 0; i < 4; i++) {
			int suit = 0;
			switch(i) {
			case 0:
				suit = 1;
				break;
			case 1:
				suit = 2;
				break;
			case 2:
				suit = 3;
				break;
			case 3:
				suit = 4;
				break;
			default:
				System.out.println("What happened?");
			}
			for(int j = 0; j < 14; j++) {
				int value = j;
				this.deck.add(new Card(suit,value));
			}
		}
		
	}
	
	/** Randomizes the deck. */
	//First method takes the object array and shuffles them
	@Override
	public void shuffle() {
		Collections.shuffle(deck);
	}

	/** Adds a card to the end of the deck. */
	//Second method creates a random suite and a random rank and creates a new card and adds to the object array
	@Override
	public void addCard(PCard card)
	{
		deck.add(card);
	}

	/** Removes a card from the end of the deck. */
	//Third method gets the card from the deck and removes it
	@Override
	public PCard dealCard() {
		PCard card = deck.get(cardCount() - 1);
		deck.remove(cardCount()-1);
		return card;
	}

	/** Removes a card from the end of the deck and marks it as hidden. */
	//This one returns null
	@Override
	public PCard dealHiddenCard() {
		PCard card;
		card = deck.remove(deck.size()-1);
		card.hideCard();
		return card;
				//(Card) deck.get(cardCount() - 1)
	}

	/** Returns the number of cards in the deck. */
	//This method returns the length of the Array
	@Override
	public int cardCount() {
		return deck.size();
	}
	
	//This was extra I was trying to figure out how to print each object of the array
	
	//Deck is where the Array list is implemented and each card is made
	
	
	//This is the main and runs the program
	public static void main(String[] args) {
		Deck Deck = new Deck();
		System.out.println(Deck.cardCount());
		Deck.dealCard();
		Deck.dealHiddenCard();
		//System.out.println(Deck.toString() + " ");
		DeckTest.run(Deck);
	}

}
