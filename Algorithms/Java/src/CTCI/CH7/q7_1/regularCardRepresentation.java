package CTCI.CH7.q7_1;

public class regularCardRepresentation {
    private regularCardSuitEnum suit;
    private int value;

    public regularCardRepresentation(regularCardSuitEnum suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public regularCardSuitEnum getSuit() {
        return suit;
    }
}
