package baiTap.strategy;

import baiTap.model.Book;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByAuthor implements SearchStrategy {
    @Override
    public List<Book> search(List<Book> books, String query) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(query))
                .collect(Collectors.toList());
    }
}
