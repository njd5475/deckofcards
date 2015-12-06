package com.njd5475.deckofcards;

import java.util.Random;

public class Deck implements Dealable {

	private Card cards[];
	private Random random;

	public Deck(Suit suits[], Face faces[], Random random) {
		cards = new Card[suits.length * faces.length];
		int i = 0;
		for (Suit suit : suits) {
			for (Face face : faces) {
				cards[i++] = new Card(suit, face);
			}
		}
		this.random = random;
	}

	public void shuffle() {

	}

	public Card dealOneCard() {
		return null;
	}

	public Card peekTopCard() {
		return null;
	}
}
