package CTCI.CH7.q7_5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int isbn;
    private Author author;
    private List<Book> bookList;

    public Book(int isbn, Author author){
        this.isbn = isbn;
        this.author = author;
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
