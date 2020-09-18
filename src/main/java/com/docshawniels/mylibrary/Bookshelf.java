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
    private Collection<Book> book;

    // Constructors
    protected Bookshelf() {}

    public Bookshelf(String name) {
        this.name = name;
    }
    // Getters and Setters
}
