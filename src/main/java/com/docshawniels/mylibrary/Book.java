package com.docshawniels.mylibrary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
    // Instance Variables
    @GeneratedValue
    @Id
    private long id;
    private String title;
    @ManyToOne
    private Bookshelf shelf;

    // Constructors
    protected Book() {}

    public Book(String title) {
        this.title = title;
    }

    // Getters and Setters

}
