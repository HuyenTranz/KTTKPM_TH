package baiTap.strategy;

import baiTap.model.Book;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByGenre implements SearchStrategy {
    @Override
    public List<Book> search(List<Book> books, String query) {
        return books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(query))
                .collect(Collectors.toList());
    }
}
