package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    // Dependency — BookRepository வேணும் BookService க்கு
    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService object created!");
    }

    // Setter Injection — Exercise 2 க்கு இதுதான் key!
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookRepository injected into BookService!");
    }

    public void displayBookInfo() {
        // BookRepository-ஐ பயன்படுத்துறோம்
        System.out.println(bookRepository.getBookDetails());
    }
}
