import java.util.Scanner;

public class L3_10_DeckOfCards {

    static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    static String[] initializeDeck() {
        String[] deck = new String[SUITS.length * RANKS.length];
        int index = 0;
        for (String suit : SUITS)
            for (String rank : RANKS) deck[index++] = rank + " of " + suit;
        return deck;
    }

    static String[] shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int random = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
        return deck;
    }

    static String[][] distribute(String[] deck, int cards, int players) {
        if (players < 1 || cards > deck.length || cards % players != 0) return null;
        String[][] hands = new String[players][cards / players];
        for (int i = 0; i < cards; i++) hands[i % players][i / players] = deck[i];
        return hands;
    }

    static void print(String[][] hands) {
        for (int i = 0; i < hands.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : hands[i]) System.out.println("  " + card);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cards = sc.nextInt(), players = sc.nextInt();
        String[][] hands = distribute(shuffle(initializeDeck()), cards, players);
        if (hands == null) System.out.println("Cannot distribute");
        else print(hands);
    }
}
