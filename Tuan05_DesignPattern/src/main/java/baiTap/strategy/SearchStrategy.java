package baiTap.strategy;

import baiTap.model.Book;

import java.util.List;

public interface SearchStrategy {
    List<Book> search(List<Book> books, String query);
}
