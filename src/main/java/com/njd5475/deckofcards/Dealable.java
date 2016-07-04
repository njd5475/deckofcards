package com.njd5475.deckofcards;

/**
 * This interface defines the operations necessary to be a dealable deck of cards. A dealable deck
 * is only meant to deal out cards and is not meant to have cards returned to the deck.
 * 
 * @author njd5475
 */
public interface Dealable {

	/**
	 * This method randomizes the remaining cards
	 */
	public void shuffle();
	
	/**
	 * Returns a card if there are more cards to be dealt. Otherwise this method returns null.
	 * <br/>
	 * This method never returns the same card more than once.
	 * 
	 * @return A card instance if more to be dealt
	 */
	public Card dealOneCard();
	
	/**
	 * Returns the top card on the deck if there is one. Or null otherwise.
	 * <br/>
	 * This method will return the same card whenever called until dealOneCard or shuffle are called.
	 * 
	 * @return Top card.
	 */
	public Card peekTopCard();
}
