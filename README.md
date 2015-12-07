# deckofcards
Library to simulate a regular 52 card deck of playing cards.

# How to use
Simply instantiate a new Deck using either the enums Suit, and Face or build arrays made up of how many combinations of each Suit and Face card   for different variations of playing card decks. 

		// For instance, a pinochle deck
		Deck = new Deck(Suit.values(), new Face[]{Ace, King, Queen, Jack, Ten, Nine, Ace, King, Queen, Jack, Ten, Nine});

# Limitations and Future implementation
The library currently only defines a Dealable deck. There are no capabilities for returning cards to a Dealable implementation. There migh be an additional implementation of a Redealable deck. Possibly creating an interface for a discard pile, something like ReplaceableDeck. Or make another Dealable implementation that recreates the deck with subsequent call to shuffle after all cards have been dealt.
