public class DeckOfCards {

    String[] deck = new String[52];
    String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
    String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    String[][] playerCards = new String[4][9];

    public String[] shuffleCards() {
        int count = 0;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[count] = suit[i] + "-" + rank[j];
                count++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < deck.length; j++) {
                int temp = (int) Math.floor(Math.random() * 52);
                String temp1 = deck[i];
                deck[i] = deck[temp];
                deck[temp] = temp1;
            }
        }
        return deck;
    }


    public void showCards(String[] deck) {
        int index = 0;
        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("Player :  " + (i + 1));
            for (int j = 0; j < playerCards[i].length; j++) {
                playerCards[i][j] = deck[index];
                System.out.print(" " + playerCards[i][j] + " ");
                index++;
            }
            System.out.println("");
        }
    }
}
