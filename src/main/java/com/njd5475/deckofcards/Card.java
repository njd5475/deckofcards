package com.njd5475.deckofcards;

public class Card {

	private Suit suit;
	private Face face;

	public Card(Suit suit, Face face) {
		this.suit = suit;
		this.face = face;
	}

	public Suit getSuit() {
		return suit;
	}
	
	public Face getFace() {
		return face;
	}
	
}
