package com.docshawniels.mylibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    BookRepository bookRepo;

    @Autowired
    BookshelfRepository bookshelfRepo;

    @Override
    public void run(String... args) throws Exception {
        /*   Methods to Read Data   */

    }

}
