package com.docshawniels.mylibrary;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MylibraryApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void bookshelfInstantiates() {
		// Arrangement and Activation
		Bookshelf testShelf1 = new Bookshelf();
		Bookshelf testShelf2 = new Bookshelf();

		Book testBook = new Book();

		// Assertion
		assertEquals(testShelf1.getClass(), testShelf2.getClass());
	}

	@Test
	void bookInstantiates() {
		// Arrangement and Activation
		Book testBook1 = new Book();
		Book testBook2 = new Book();

		Bookshelf testShelf = new Bookshelf();

		// Assertion
		assertEquals(testBook1.getClass(), testBook2.getClass());
	}

	@Test
	void bookshelfHoldsMultipleBooks() {
		// Arrangement and Activation
		Bookshelf testShelf1 = new Bookshelf("shelf1");
		Bookshelf testShelf2 = new Bookshelf("shelf2");
		Book testBook1 = new Book("book1", testShelf1);
		Book testBook2 = new Book("book2", testShelf1);

		// Assertion
		assertEquals(testShelf1, testBook1.getShelf());
		assertEquals(testShelf1, testBook2.getShelf());
	}

}
