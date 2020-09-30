package labwork4;

import java.util.*;

public class Deal {
    public static void main(String[] args) {
        final int HAND_LIMIT = 5;

        List<String> deck = new ArrayList<>();
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] cards = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Jack", "Queen", "King" };

        for (String suit : suits) {
            for (String card : cards) {
                deck.add(card + " of " + suit);
            }
        }

        Collections.shuffle(deck);

        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            System.out.printf("Player #%d:\n", i + 1);
            for (int j = 0; j < HAND_LIMIT; j++) {
                String nextCard = (deck.size() > 0 ? deck.remove(0) : null);
                if (nextCard == null) {
                    System.err.println("Out of cards.");
                    System.exit(1);
                }
                System.out.printf("%d:\t%s\n", j + 1, nextCard);
            }
            System.out.println();
        }
    }
}