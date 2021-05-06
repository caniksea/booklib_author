package com.caniksea.adp3.practical.booklib.authormodule.controller;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import com.caniksea.adp3.practical.booklib.authormodule.domain.library.BookAuthor;
import com.caniksea.adp3.practical.booklib.authormodule.factory.generic.AuthorFactory;
import com.caniksea.adp3.practical.booklib.authormodule.factory.library.BookAuthorFactory;
import com.caniksea.adp3.practical.booklib.authormodule.factory.library.BookFactory;
import com.caniksea.adp3.practical.booklib.authormodule.service.generic.AuthorService;
import com.caniksea.adp3.practical.booklib.authormodule.service.generic.impl.AuthorServiceImpl;
import com.caniksea.adp3.practical.booklib.authormodule.service.library.BookAuthorService;
import com.caniksea.adp3.practical.booklib.authormodule.service.library.BookService;
import com.caniksea.adp3.practical.booklib.authormodule.service.library.impl.BookAuthorServiceImpl;
import com.caniksea.adp3.practical.booklib.authormodule.service.library.impl.BookServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * Instructions:
 *  > Make sure you have completed the task(s) in Playground.java before attempting tasks below.
 *  > Use JUNIT testing framework ONLY.
 *  > Use appropriate assert method(s).
 *
 */
public class PlaygroundTest {

    private static Author author1 = AuthorFactory.buildAuthor("Chinua", "Achebe");
    private static Author author2 = AuthorFactory.buildAuthor("Jones", "James");
    private static AuthorService authorService = AuthorServiceImpl.getService();

    private static Book book1 = BookFactory.buildBook("Things fall apart", 1980);
    private static Book book2 = BookFactory.buildBook("The Millionaire club", 2020);
    private static BookService bookService = BookServiceImpl.getService();

    private static BookAuthor bookAuthor1 = BookAuthorFactory.buildBookAuthor(book1.getId(), author1.getId());
    private static BookAuthor bookAuthor2 = BookAuthorFactory.buildBookAuthor(book1.getId(), author2.getId());
    private static BookAuthor bookAuthor3 = BookAuthorFactory.buildBookAuthor(book2.getId(), author2.getId());
    private static BookAuthorService bookAuthorService = BookAuthorServiceImpl.getService();

    @Before
    public void setUp(){
        authorService.create(author1);
        authorService.create(author2);

        bookService.create(book1);
        bookService.create(book2);

        bookAuthorService.create(bookAuthor1);
        bookAuthorService.create(bookAuthor2);
        bookAuthorService.create(bookAuthor3);
    }



    /**
     * Tasks:
     *  > Replace the throw exception with an implementation of the test case for getBookAuthorsLastName(). (7.625 marks)
     *
     */
    @Test
    public void getBookAuthorsLastName() {
        Playground playground = new Playground();
        Set<String> lastnames = playground.getBookAuthorsLastName(book1.getId());
        assertEquals(2, lastnames.size());
        System.out.println("Lastname: " + lastnames);
    }

    /**
     * Tasks:
     *  > Replace the throw exception with an implementation of the test case for getBookTitlesByAuthorforYear(). (6.625 marks)
     *
     */
    @Test
    public void getBookTitlesByAuthorforYear() {
        throw new UnsupportedOperationException();
    }
}