package com.njd5475.deckofcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * This is a simple implementation of a dealable deck of cards. The deck is
 * defined by a set of cards which are created from an
 * 
 * @author njd5475
 */
public class Deck implements Dealable {

	private List<Card>	cards;
	private Random		random;

	/**
	 * Creates a deck of cards using the suits and faces to construct a list of
	 * cards. 
	 * 
	 * @param suits The suits to be used
	 * @param faces The faces for each suit
	 * @param random A random number generator.
	 */
	public Deck(Suit suits[], Face faces[], Random random) {
		cards = new ArrayList<Card>(suits.length * faces.length);
		for (Suit suit : suits) {
			for (Face face : faces) {
				cards.add(new Card(suit, face));
			}
		}
		this.random = random;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.njd5475.deckofcards.Dealable#shuffle()
	 */
	public void shuffle() {
		Card[] array = cards.toArray(new Card[cards.size()]);
		Card current = null;
		int replacedLocation = 0;
		// iterate over entire array once
		for (int i = 0; i < array.length; ++i) {
			current = array[i];
			replacedLocation = random.nextInt(array.length);

			// swap with random location anywhere in array
			array[i] = array[replacedLocation];
			array[replacedLocation] = current;
		}

		cards = new ArrayList<Card>(Arrays.asList(array));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.njd5475.deckofcards.Dealable#dealOneCard()
	 */
	public Card dealOneCard() {
		if (!cards.isEmpty()) {
			return cards.remove(0);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.njd5475.deckofcards.Dealable#peekTopCard()
	 */
	public Card peekTopCard() {
		if (!cards.isEmpty()) {
			return cards.get(0);
		}
		return null;
	}
}
