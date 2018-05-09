package CTCI.CH7.q7_5;

public class Trilogy extends Book {
    private String trilogyName;
    private int trilogyNumber;

    public Trilogy(int isbn, Author author, String trilogyName, int trilogyNumber) {
        super(isbn, author);
        this.trilogyName = trilogyName;
        this.trilogyNumber = trilogyNumber;
    }

    public String getTrilogyName() {
        return trilogyName;
    }

    public int getTrilogyNumber() {
        return trilogyNumber;
    }
}
