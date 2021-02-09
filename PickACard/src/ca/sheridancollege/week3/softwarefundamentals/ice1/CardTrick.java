/**
 * Krista Ryk
 * 99146369
 * Feb 8 2021
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

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
      
        Card luckyCard = new Card(Card.SUITS[1], Card.VALUES[12]);

        // and search magicHand for luckyCard here         
       if (luckyCard.getSuit().equals(c.getSuit()) &&
               luckyCard.getValue().equals(c.getValue())){ 
         
           System.out.println("\nCongratulations! The special Lucky Card was in "
                   + "the Magic Hand! You win!");
       }else{
           System.out.println("\nNo match! Sorry your card was not lucky "
                   + ":(  Feel free to try again!");
       }
        
        
        
    }

}
