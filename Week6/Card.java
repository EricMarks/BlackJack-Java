/*
Program/Project:
Name: Eric Marks
Date:
Description:
*/

package Week6;

import java.awt.Color;

import Week6.PCard;

//Create a Class that inherits PCard and creates a card object
public class Card extends PCard {
	//Declaring the variables
	public int rank = 0;
	public int suit = 0;
	public String faceName = "";
	public char hello;
	public static final int SPADE = 1;
	public static final int DIAMOND = 2;
	public static final int CLUB = 3;
	public static final int HEART = 4;
	public boolean hidden = false;
	
	public Color getFontColor() {
		return Color.BLACK;
	}
	public Color getFaceColor() {
		return new Color(111,196,21);
	}
	public Color getBackColor() {
		return  new Color(111,196,21);
	}
	public Color getBorderColor() {
		return Color.BLACK;
	}
	public Color getStripeColor() {
		return Color.PINK;
	}

	
	
	//This takes in the variables for suite, face, and the rank of the card
	public Card(int suite, int value) {
		this.suit = suite;
		this.rank = value;
	}
	
	public int getRank() {
		return rank;
	}
	
	public int getSuit() {
		return suit;
	}
	@Override
	public void showCard() {
		this.hidden = false;
		
	}
	@Override
	public void hideCard() {
		this.hidden = true;
	}
	
	@Override
	public boolean isHidden() {
		return hidden;
	}
	
	
	//this method overides the abstract method of PCard
	public String getText() {
		String text = "";
		switch(getRank()) {
		case 0:
			text += "KN";
			break;
		case 1:
			text += "Ace";
			break;
		case 2:
			text += "2";
			break;
		case 3:
			text += "3";
			break;
		case 4:
			text += "4";
			break;
		case 5:
			text += "5";
			break;
		case 6:
			text += "6";
			break;
		case 7:
			text += "7";
			break;
		case 8:
			text += "8";
			break;
		case 9:
			text += "9";
			break;
		case 10:
			text += "10";
			break;
		case 11:
			text += "Jack";
			break;
		case 12:
			text += "Queen";
			break;
		case 13:
			text += "King";
			break;
		}
		
		switch(getSuit()) {
		case SPADE: 
			text += "\u2660";
			break;
		case DIAMOND: 
			text += "\u2666";
			break;
		case CLUB: 
			text += "\u2663";
			break;
		case HEART: 
			text += "\u2764";
			break;
		default:
			System.out.println("What the heck, why did i do that?");
		}
		
		
		return text;
		// Return a value such as "\u2605"
	}
	
	
	
	public static void main(String[] args) {
		
		//This uses CardTest to run and makes a new object with Card
		//and passes three variables
		CardTest.run(new Card(2, 8));
	}

}