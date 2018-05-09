package CTCI.CH7.q7_5;

public class Client {
    private Shelf shelf;
    private String username;

    public Client(String username){
        this.username = username;
        shelf = new Shelf(this);
    }

    public Shelf getShelf() {
        return shelf;
    }

    public String getUsername() {
        return username;
    }
}
