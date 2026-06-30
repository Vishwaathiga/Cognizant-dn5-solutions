package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class Main {
    public static void main(String[] args) {

        // Spring IoC Container load பண்றோம் — XML file படிக்கும்!
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");

        // Spring-ஓட "bookService" bean-ஐ எடுக்கறோம்
        // (BookRepository ஏற்கனவே automatic ஆ inject ஆகியிருக்கும்!)
        BookService bookService = (BookService) context.getBean("bookService");

        // Method call பண்ணு
        bookService.displayBookInfo();
    }
}