package com.caniksea.adp3.practical.booklib.authormodule.controller;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.domain.library.BookAuthor;
import com.caniksea.adp3.practical.booklib.authormodule.service.generic.AuthorService;
import com.caniksea.adp3.practical.booklib.authormodule.service.generic.impl.AuthorServiceImpl;
import com.caniksea.adp3.practical.booklib.authormodule.service.library.BookAuthorService;
import com.caniksea.adp3.practical.booklib.authormodule.service.library.impl.BookAuthorServiceImpl;


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Instructions:
 *  > Make sure you have completed all tasks in the service package.
 *  > Do not modify class signature.
 *
 */
public class Playground {

    /**
     * Tasks:
     *  > Replace the throw exception with an implementation that returns lastname of all authors
     *      of a given book. (6 marks)
     *
     * @param bookId
     * @return
     */
    Set<String> getBookAuthorsLastName(String bookId) {
        BookAuthorService bookAuthorService = BookAuthorServiceImpl.getService();
        AuthorService authorService = AuthorServiceImpl.getService();
        Set<BookAuthor> bookAuthors = bookAuthorService.getBookAuthorsForBook(bookId);
        Set<String> lastnames = new HashSet<>();

        for (BookAuthor bookAuthor : bookAuthors) {
            Author author = authorService.read(bookAuthor.getAuthorId());
            if(author != null) lastnames.add(author.getLastName());
        }
        return lastnames;
    }

    /**
     * Tasks:
     *  > Replace the throw exception with an implementation that returns the title of all books
     *      of a given author in a given year. (7 marks)
     *
     * @param authorId
     * @param year
     * @return
     */
    Set<String> getBookTitlesByAuthorforYear(String authorId, int year) {
        throw new UnsupportedOperationException();
    }
}
