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

    public Card() {
    }

    private String suit; //clubs, spades, diamonds, hearts
    private String value;//1-13

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades",
        "Clubs"};

    public static final String[] VALUES = {"Ace", "Two", "Three", "Four", 
        "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen","King"};
    
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }
    
    //@return the suit
    public String getSuit() {
        return this.suit;
    }

    //@param suit the suit to set
    public void setSuit(String suit) {
        this.suit = suit;
    }

    
    //@return the value
    public String getValue() {
        return value;
    }
    
    //@param value the value to set
    public void setValue(String value) {
        this.value = value;
    }

}
