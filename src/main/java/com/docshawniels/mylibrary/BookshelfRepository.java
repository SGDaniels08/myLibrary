package com.docshawniels.mylibrary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface BookshelfRepository extends CrudRepository<Bookshelf, Long> {
}
