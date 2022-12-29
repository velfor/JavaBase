import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private static final int DECK_START_SIZE = 52;
    private List<Card> deck;

    public Deck(){
        deck = new ArrayList<>(DECK_START_SIZE);
        CardRank[] ranks = CardRank.values();
        CardSuits[] suits = CardSuits.values();
        for (CardRank rank: ranks)
            for (CardSuits suit:suits)
                deck.add(new Card(rank,suit));
        Collections.shuffle(deck);
    }

    @Override
    public String toString() {
        return deck.toString();
    }
}
