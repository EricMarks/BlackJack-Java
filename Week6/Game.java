package Week6;

import java.awt.Color;

public class Game {
	



	public static void main(String[] args) {
		

		Deck deck = new Deck();
		Hand hand = new Hand();
		Hand dealerHand = new Hand();
		
		
		PGame.setBackgroundColor(new Color(219,176,21));
		PGame.setButtonColor(new Color(111,196,21));
		PGame.setButtonHighlightColor(Color.BLUE);
		PGame.setBannerColor(Color.BLACK);
		PGame.setBannerTextColor(Color.WHITE);
		PGame.setStatusTextColor(Color.BLACK);
		PGame.setButtonTextColor(Color.BLACK);
		
		
		
		
		
		//CardTest.run(card);
		//DeckTest.run(deck);
		PGame.run(deck, dealerHand, hand);
	}
}
