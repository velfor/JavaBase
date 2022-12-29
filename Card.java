enum CardRank{R2, R3, R4, R5, R6, R7, R8, R9, R10, RJ, RQ, RK, RA}
enum CardSuits {CLUBS, DIAMONDS, HEARTS, SPADES}
public class Card {
    private CardRank rank;
    private CardSuits suit;

    public Card(){}

    public Card(CardRank rank, CardSuits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String str = "";
        if (rank == CardRank.R2) str += '2';
        else if (rank == CardRank.R3) str += '3';
        else if (rank == CardRank.R4) str += '4';
        else if (rank == CardRank.R5) str += '5';
        else if (rank == CardRank.R6) str += '6';
        else if (rank == CardRank.R7) str += '7';
        else if (rank == CardRank.R8) str += '8';
        else if (rank == CardRank.R9) str += '9';
        else if (rank == CardRank.R10) str += "10";
        else if (rank == CardRank.RJ) str += 'J';
        else if (rank == CardRank.RQ) str += 'Q';
        else if (rank == CardRank.RK) str += 'K';
        else if (rank == CardRank.RA) str += 'A';

        if (suit == CardSuits.CLUBS) str += '\u2667';
        else if (suit == CardSuits.DIAMONDS) str += '\u2662';
        else if (suit == CardSuits.HEARTS) str += '\u2661';
        else if (suit == CardSuits.SPADES) str += '\u2664';

        return str;
    }
}
