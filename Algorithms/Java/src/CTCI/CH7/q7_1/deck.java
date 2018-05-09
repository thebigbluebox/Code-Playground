package CTCI.CH7.q7_1;

import java.util.List;

public abstract class deck <T>{
    List<card> cards;

    public deck(List<card> cards){
        this.cards = cards;
    }

    public List<card> getCards() {
        return cards;
    }
}
