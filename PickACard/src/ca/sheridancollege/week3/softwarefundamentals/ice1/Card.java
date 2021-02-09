/**
 * Krista Ryk
 * 99146369
 * Feb 8 2021
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have a value (note that Ace =
 * 1, Jack -11, Queen =12, King = 13) A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers. This code is to be used in ICE1.
 * When you create your own branch, add your name as a modifier.
 *
 * @author dancye
 */
public class Card {

    public enum Suit {
        HEARTS, DIAMONDS, SPADES, CLUBS
    }

    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, JACK, QUEEN, KING
    }

    private Suit suit; //clubs, spades, diamonds, hearts
    private Value value;//1-13

//    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades",
//        "Clubs"};

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }
    
    //@return the suit
    public Suit getSuit() {
        return this.suit;
    }

    //@param suit the suit to set
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    
    //@return the value
    public Value getValue() {
        return value;
    }
    
    //@param value the value to set
    public void setValue(Value value) {
        this.value = value;
    }

}
