# deckofcards
Library to simulate a regular 52 card deck of playing cards.

# How to use
Simply instantiate a new Deck using either the enums Suit, and Face or build arrays made up of how many combinations of each Suit and Face card   for different variations of playing card decks. 

		// For instance, a pinochle deck
		Deck = new Deck(Suit.values(), new Face[]{Ace, King, Queen, Jack, Ten, Nine, Ace, King, Queen, Jack, Ten, Nine});

# Limitations and Future implementation
The library currently only defines a Dealable deck. There are no capabilities for returning cards to a Dealable implementation. In the future there might be an additional implementation of a Redealable deck. Another possibility would be creating an interface for a discard pile. Perhaps something like ReplaceableDeck. Or this implementation could be modified so that a subsequent call to shuffle after all cards have been dealt would recreate the cards.
