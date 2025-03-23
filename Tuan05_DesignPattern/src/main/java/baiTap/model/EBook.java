package baiTap.model;

public class EBook extends Book {
    public EBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void displayInfo() {
        System.out.println("EBook - Title: " + title + ", Author: " + author + ", Genre: " + genre);
    }
}
