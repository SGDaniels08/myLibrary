package com.docshawniels.mylibrary;

import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    // Instance Variables
    private BookStorage bookStorage;

    // Constructors
    public BookController(BookStorage bookStorage) {
        this.bookStorage = bookStorage;
    }

    // Getters and Setters
    public BookStorage getBookStorage() {
        return bookStorage;
    }
    public void setBookStorage(BookStorage bookStorage) {
        this.bookStorage = bookStorage;
    }


    // HTTP Methods
}
