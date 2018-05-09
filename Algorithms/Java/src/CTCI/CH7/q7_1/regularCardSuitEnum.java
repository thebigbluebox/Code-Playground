package CTCI.CH7.q7_1;

public enum regularCardSuitEnum {
    CLUBS("Clubs", 1),
    DIAMOND("Diamond", 2),
    HEARTS("Hearts", 3),
    SPADE("Spade", 4);

    private String suitName;
    private int ordinal;

    regularCardSuitEnum(String suitName, int ordinal){
        this.suitName = suitName;
        this.ordinal = ordinal;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public String getSuitName() {
        return suitName;
    }
}
