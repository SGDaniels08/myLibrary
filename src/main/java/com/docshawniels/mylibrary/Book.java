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

    public Book(String title, Bookshelf shelf) {
        this.title = title;
        this.shelf = shelf;
    }

    // Getters and Setters

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Bookshelf getShelf() {
        return shelf;
    }
    public void setShelf(Bookshelf shelf) {
        this.shelf = shelf;
    }
}
