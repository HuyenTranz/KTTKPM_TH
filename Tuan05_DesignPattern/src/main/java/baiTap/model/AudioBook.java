package baiTap.model;

public class AudioBook extends Book {
    public AudioBook(String title, String author, String genre) {
        super(title, author, genre);
    }

    @Override
    public void displayInfo() {
        System.out.println("AudioBook - Title: " + title + ", Author: " + author + ", Genre: " + genre);
    }
}
