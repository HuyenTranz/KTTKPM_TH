package baiTap.factory;

import baiTap.model.*;

public class BookFactory {

    public static Book createBook(String type, String title, String author, String genre) {
        switch (type.toLowerCase()) {
            case "physical":
                return new PhysicalBook(title, author, genre);
            case "ebook":
                return new EBook(title, author, genre);
            case "audiobook":
                return new AudioBook(title, author, genre);
            default:
                throw new IllegalArgumentException("Invalid book type: " + type);
        }
    }
}
