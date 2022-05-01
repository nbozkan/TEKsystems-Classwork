/**
 * 
 */
package Arrays;

import java.util.Random;

/**
 * @author nbwoz
 *
 */
public class DeckOfCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String cardSuit, cardValue;
		
		// Initialize cards
		for(int i = 0; i < deck.length; i++)
		{
			deck[i] = i;
		}
		
		Random random = new Random();
		
		// Pick four random cards
		int[] randomCards = new int[4];
		for(int i = 0; i < randomCards.length; i++)
		{
			randomCards[i] = deck[random.nextInt(deck.length)];
		}
		
		// Print random cards
		for(int i = 0; i < randomCards.length; i++)
		{
			// Determine what suit the card number comes from
			cardSuit = suits[randomCards[i]/13];
			
			// Determine the values
			cardValue = values[randomCards[i]%13];
			
			System.out.println(randomCards[i] + " : " + cardValue + " of " + cardSuit);
		}

	}

}
