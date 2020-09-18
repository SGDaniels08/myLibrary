package com.docshawniels.mylibrary;

import javax.persistence.Entity;

@Entity
public class Book {
    // Instance Variables
    private String title;

    // Constructors
    protected Book() {}

    public Book(String title) {
        this.title = title;
    }

    // Getters and Setters


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
