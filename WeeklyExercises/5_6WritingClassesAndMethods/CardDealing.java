package Assignment;
import java.util.Random;



public class CardDealing {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faceValues = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Array to hold dealt cards
        Card[] dealtCards = new Card[5];

        Random random = new Random();

        // Deal five random cards
        for (int i = 0; i < 5; i++) {
            String suit = suits[random.nextInt(suits.length)];
            String faceValue = faceValues[random.nextInt(faceValues.length)];
            dealtCards[i] = new Card(suit, faceValue);
        }

        // Print the dealt cards
        System.out.println("Dealt Cards:");
        for (Card card : dealtCards) {
            System.out.println(card);
        }
    }
}
