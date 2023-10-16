package org.seminars.fourth;

import java.util.List;

    //Класс-сервис для работы с данными
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Метод для получения книги по ID из подключенной базы данных
    public Book findBookById(String id) {
        return bookRepository.findById(id);
    }

    // Метод для получения всех книг из подключенной базы данных
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}

