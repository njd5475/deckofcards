package com.njd5475.deckofcards;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {

	private Dealable deck;

	@Before
	public void setup() {
		deck = new Deck(Suit.values(), Face.values(), new Random(System.currentTimeMillis()));
	}
	
	@Test
	public void testShuffle() throws Exception {
		Card topBeforeSuffle = deck.peekTopCard();
		assertNotNull(topBeforeSuffle);
		deck.shuffle();
		Card topAfterShuffle = deck.peekTopCard();
		assertNotEquals(topBeforeSuffle, topAfterShuffle);
	}

	@Test
	public void testDealOneCard() throws Exception {
		deck.shuffle();
		for(int i = 0; i < 52; ++i) {
			assertNotNull(deck.dealOneCard());
		}

		Card card = deck.dealOneCard();
		assertNull(card);
	}

}
