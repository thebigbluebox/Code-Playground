package CTCI.CH7.q7_5;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<Book> bookList;
    private Client client;

    public Shelf(Client client){
        this.client = client;
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public Client getClient() {
        return client;
    }

}
