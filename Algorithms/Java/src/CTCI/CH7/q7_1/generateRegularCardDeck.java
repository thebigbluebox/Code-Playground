package CTCI.CH7.q7_1;

import java.util.ArrayList;
import java.util.List;

public class generateRegularCardDeck {
    public static void main(String[] args){
        List<regularCardRepresentation> regularCardDeck = new ArrayList<>();
        for(regularCardSuitEnum suit: regularCardSuitEnum.values()){
            for(int i = 1; i <= 13; i++){
                regularCardDeck.add(new regularCardRepresentation(suit, i));
            }
        }
        regularCardDeck cards = new regularCardDeck(regularCardDeck);
        System.out.println("Done");
    }
}
