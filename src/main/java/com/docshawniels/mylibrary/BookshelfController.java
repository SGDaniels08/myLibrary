package com.docshawniels.mylibrary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class BookshelfController {
    // Instance Variable
    private BookshelfStorage bookshelfStorage;

    // Constructor
    public BookshelfController(BookshelfStorage bookshelfStorage) {
        this.bookshelfStorage = bookshelfStorage;
    }

    // Getters and Setters

    public BookshelfStorage getBookshelfStorage() {
        return bookshelfStorage;
    }
    public void setBookshelfStorage(BookshelfStorage bookshelfStorage) {
        this.bookshelfStorage = bookshelfStorage;
    }

    // HTTP Methods

    @GetMapping("/","")

    @GetMapping()
    public String getAllBooksOnShelf() {

    }
    // addBook()
    // removeBook()
    // updateBook()
}
