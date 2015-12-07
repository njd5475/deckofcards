package com.njd5475.deckofcards;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CardTest {

	private Card	card;

	@Test
	public void testGetSuit() throws Exception {
		card = new Card(Suit.Spades, Face.Ace);
		assertEquals(Suit.Spades, card.getSuit());
	}

	@Test
	public void testGetFace() throws Exception {
		card = new Card(Suit.Spades, Face.Ace);
		assertEquals(Face.Ace, card.getFace());
	}

	@Test
	public void testCardCannotHaveNulls() throws Exception {
		try { 
			card = new Card(null, null);
			fail("Card should not be created with nulls!");
		}catch(NullPointerException npe) {
			assert(true);
		}
		
		try { 
			card = new Card(Suit.Clubs, null);
			fail("Card should not be created with null face value!");
		}catch(NullPointerException npe) {
			assert(true);
		}
		
		try { 
			card = new Card(null, Face.King);
			fail("Card should not be created with null suit!");
		}catch(NullPointerException npe) {
			assert(true);
		}
	}
}
