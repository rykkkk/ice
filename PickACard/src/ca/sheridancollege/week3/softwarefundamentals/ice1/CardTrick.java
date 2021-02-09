/**
 * Krista Ryk
 * 99146369
 * Feb 8 2021
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;




import java.util.Scanner;

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

//your hand of 7 cards
        for (int i = 0; i < magicHand.length; i++) {
            
            Card c = new Card();

            int valRand = (int)(Math.random() * 13);
            int suitRand = (int)(Math.random() * 4);

            c.setValue(Card.VALUES[valRand]);
            c.setSuit(Card.SUITS[suitRand]);//4 suitcs
            magicHand[i] = c;
        }

        System.out.println("Pick a card, any card!");

        System.out.println("\nThe suits are: ");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println("  " + (i + 1) + ": " + Card.SUITS[i]);
        }

        System.out.println("The values are: ");
        for (int i = 0; i < Card.VALUES.length; i++) {
            System.out.println("  " + (i + 1) + ": " + Card.VALUES[i]);
        }

      //  System.out.print("Enter suit (1-4): ");
      //  Scanner input = new Scanner(System.in);

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
