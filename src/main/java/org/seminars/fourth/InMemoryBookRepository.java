package org.seminars.fourth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    // Класс-заглушка для замены базы данных
public class InMemoryBookRepository implements BookRepository  {
    private final Map<String, Book> books;

    // Конструктор с добавлением 2 книг
    public InMemoryBookRepository() {
        this.books = new HashMap<>();
        books.put("1", new Book("1", "Book1", "Author1"));
        books.put("2", new Book("2", "Book2", "Author2"));
    }

    // Метод для получения книги по ID
    @Override
    public Book findById(String id) {
        return books.get(id);
    }

    // Метод для получения всех книг
    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }
}
