/**
 * Krista Ryk
 * 99146369
 * Feb 8 2021
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import ca.sheridancollege.week3.softwarefundamentals.ice1.Card.Suit;
import ca.sheridancollege.week3.softwarefundamentals.ice1.Card.Value;
import java.util.Random;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        Value[] cValues = Value.values();
        
        Suit[] cSuits = Suit.values();
            
        Random random = new Random();
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            Value valRand = cValues[random.nextInt(cValues.length)];
            Suit suitRand = cSuits[random.nextInt(cSuits.length)];
            
            c.setValue(valRand);
            c.setSuit(suitRand);//4 suitcs
            magicHand[i] = c;     
        }

        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
