package com.njd5475.deckofcards;

import static com.njd5475.deckofcards.Face.Ace;
import static com.njd5475.deckofcards.Face.Jack;
import static com.njd5475.deckofcards.Face.King;
import static com.njd5475.deckofcards.Face.Nine;
import static com.njd5475.deckofcards.Face.Queen;
import static com.njd5475.deckofcards.Face.Ten;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
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
		for (int i = 0; i < 52; ++i) {
			assertNotNull(deck.dealOneCard());
		}

		Card card = deck.dealOneCard();
		assertNull(card);
		assertNull(deck.peekTopCard());
	}

	@Test
	public void testCreationOfPinochleDeck() {
		// For instance, a pinochle deck
		Deck pinochleDeck = new Deck(Suit.values(),
				new Face[] { Ace, King, Queen, Jack, Ten, Nine, Ace, King, Queen, Jack, Ten, Nine },
				new Random(System.currentTimeMillis()));

		pinochleDeck.shuffle();
		for (int i = 0; i < 48; ++i) {
			assertNotNull(pinochleDeck.dealOneCard());
		}
		assertNull(pinochleDeck.dealOneCard());
	}
	
	@Test
	public void testDeckMakeUp() {
		Map<Suit, LinkedList<Face>> makeUp = new HashMap<Suit, LinkedList<Face>>();
		
		Card card = null;
		while((card = deck.dealOneCard()) != null) {
			LinkedList<Face> faces = makeUp.get(card.getSuit());
			if(faces == null) {
				faces = new LinkedList<Face>();
				makeUp.put(card.getSuit(), faces);
			}
			faces.add(card.getFace());
		}
		
		assertEquals(4, makeUp.keySet().size());
		for(Suit suit : Suit.values()) {
			assertEquals(13, makeUp.get(suit).size());
		}
	}
}
