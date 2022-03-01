public class Main {

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffleCards();
        String[] deck = deckOfCards.shuffleCards();
        deckOfCards.showCards(deck);
    }
}
