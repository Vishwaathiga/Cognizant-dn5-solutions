package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    public BookService() {
        System.out.println("BookService object created!");
    }
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookRepository injected into BookService!");
    }

    public void displayBookInfo() {
        System.out.println(bookRepository.getBookDetails());
    }
}
