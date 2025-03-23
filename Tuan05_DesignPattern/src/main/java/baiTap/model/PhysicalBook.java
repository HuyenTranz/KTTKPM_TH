package baiTap.model;

public class PhysicalBook extends Book {
    public PhysicalBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void displayInfo() {
        System.out.println("Physical Book - Title: " + title + ", Author: " + author + ", Genre: " + genre);
    }
}
