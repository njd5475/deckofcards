package com.njd5475.deckofcards;

/**
 * This class represents a card it contains a Suit and a Face. 
 * 
 * @author njd5475
 */
public class Card {

	private Suit suit;
	private Face face;

	/**
	 * Create a card with a suit and a face value. This constructor will ensure that
	 * there is a suit and face.
	 * <br/>
	 * A @see java.lang.NullPointerException will be thrown is either suit or face is null.
	 * 
	 * @param suit The suit that the card is in.
	 * @param face The face value of the card.
	 */
	public Card(Suit suit, Face face) {
		if(suit == null || face == null) {
			throw new NullPointerException("Cards cannot be created with null values");
		}
		this.suit = suit;
		this.face = face;
	}

	/**
	 * Returns the suit the card belongs to.
	 * 
	 * @return The suit the card belongs to.
	 */
	public Suit getSuit() {
		return suit;
	}
	
	/**
	 * Returns the face value of the card.
	 * 
	 * @return The face value of the card
	 */
	public Face getFace() {
		return face;
	}
	
}
