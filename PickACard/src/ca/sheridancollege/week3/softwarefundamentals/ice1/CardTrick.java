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

//your hand of 7 cardss
         Card c = new Card();
         for (int i = 0; i < magicHand.length; i++) {
            
            int valRand = (int)(Math.random() * 13);
            int suitRand = (int)(Math.random() * 4);
          
            c.setValue(Card.VALUES[valRand]);
            c.setSuit(Card.SUITS[suitRand]);//4 suitcs
            magicHand[i] = c;    
            
          //  System.out.println("magighand[" + i +"] = " +
          //          c.getValue() + " of " + c.getSuit());
          //^^^to show the magic hand
        }

        

        System.out.println("Time to play a magic Trick!\nPick a card, any card!");

        System.out.println("\nThe suits are: ");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println("  " + (i + 1) + ": " + Card.SUITS[i]);
        }

        System.out.println("The values are: ");
        for (int i = 0; i < Card.VALUES.length; i++) {
            System.out.println("  " + (i + 1) + ": " + Card.VALUES[i]);
        }

        //ask the user for Card value and suit, create their card
        System.out.print("\nEnter suit (1-4): ");
        Scanner input = new Scanner(System.in);
        int userSuit = input.nextInt() - 1;
        
        System.out.print("Enter value (1-13): ");
        Scanner i = new Scanner(System.in);
        int userValue = input.nextInt() - 1; 
        
        // and search magicHand here
        
        Card user = new Card(Card.SUITS[userSuit], Card.VALUES[userValue]);
        
        System.out.println("\nYou have chosen the " + user.getValue() + " of " 
                + user.getSuit() + "!");
                
       if (user.getSuit().equals(c.getSuit()) &&
               user.getValue().equals(c.getValue())){ 
         
           System.out.println("Congratulations! You picked a card from the"
                   + " Magic hand! ");
       }else{
           System.out.println("No match! Sorry your card was not in the magic"
                   + " hand :( Feel free to try again!");
       }
        
        
        
        //Then report the result here
    }

}
