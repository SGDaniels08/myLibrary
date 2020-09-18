package com.docshawniels.mylibrary;

import org.springframework.stereotype.Service;

@Service
public class BookshelfStorage {
    // Instance Variable
    private BookshelfRepository bookshelfRepo;

    // Constructor
    public BookshelfStorage(BookshelfRepository bookshelfRepo) {
        this.bookshelfRepo = bookshelfRepo;
    }

    // Getters and Setters

    public BookshelfRepository getBookshelfRepo() {
        return bookshelfRepo;
    }
    public void setBookshelfRepo(BookshelfRepository bookshelfRepo) {
        this.bookshelfRepo = bookshelfRepo;
    }
}
