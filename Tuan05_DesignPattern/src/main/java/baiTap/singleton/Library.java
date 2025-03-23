package baiTap.singleton;

import baiTap.model.Book;
import baiTap.observer.Observable;

import java.util.ArrayList;
import java.util.List;

public class Library extends Observable {
    private static Library instance;
    private List<Book> books;

    private Library() {
        books = new ArrayList<>();
    }

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers("New book added: " + book.getTitle());
    }

    public List<Book> getBooks() {
        return books;
    }
}
