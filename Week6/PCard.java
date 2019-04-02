package Week6;
import java.awt.Color;

public abstract class PCard {
	public abstract String getText(); // Return a value such as "\u2605"

	/** Sets the card to the face up state. */
	public void showCard() {
	}

	/** Sets the card to the face down state. */
	public void hideCard() {
	}

	/**
	 * Finds if the card if face-down or face-up 
	 * 
	 * @return <b>true</b> if the card if face down.
	 */
	public boolean isHidden() {
		return true;
	}

	/** Returns the color of the font used for the card text. */
	public Color getFontColor() {
		return Color.LIGHT_GRAY;
	}

	/** Returns the color of the cards face. */
	public Color getFaceColor() {
		return Color.WHITE;
	}

	/** Returns the color of the cards background. */
	public Color getBackColor() {
		return Color.WHITE;
	}

	/** Returns the color of an 8 pixel border around the edge of the card. */
	public Color getBorderColor() {
		return Color.LIGHT_GRAY;
	}

	/** Returns the alternative color used on the cards background. */
	public Color getStripeColor() {
		return Color.LIGHT_GRAY;
	}
	/*
	public PCard() {
		// TODO Auto-generated constructor stub
	}
	*/
}
