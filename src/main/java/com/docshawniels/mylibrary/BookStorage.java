package com.docshawniels.mylibrary;

import org.springframework.stereotype.Service;

@Service
public class BookStorage {

    // Instance Variable
    private BookRepository bookRepo;

    // Constructor
    public BookStorage(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    // Getters and Setters
    public BookRepository getBookRepo() {
        return bookRepo;
    }
    public void setBookRepo(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }
}
