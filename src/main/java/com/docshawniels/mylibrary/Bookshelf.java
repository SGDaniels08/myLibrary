package com.docshawniels.mylibrary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Bookshelf {
    // Instance Variables
    @GeneratedValue
    @Id
    private long id;
    private String name;
    @OneToMany (mappedBy = "shelf")
    private Collection<Book> books;

    // Constructors
    protected Bookshelf() {}

    public Bookshelf(String name) {
        this.name = name;
    }

    public Bookshelf(String name, Book... books) {
        this.name = name;
        for (Book book : books) {
            this.books.add(book);
        }
    }

    // Getters and Setters

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Collection<Book> getBooks() {
        return books;
    }
    public void setBooks(Collection<Book> books) {
        this.books = books;
    }
}
