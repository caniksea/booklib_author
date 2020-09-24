package com.caniksea.adp3.practical.booklib.authormodule.service.library.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import com.caniksea.adp3.practical.booklib.authormodule.service.library.BookService;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in BookService.java before attempting the tasks below.
 *
 * Tasks:
 *  > Implement service using singleton with a link to your repository. (1.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create methods. (0.25 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read methods. (0.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the update methods. (0.75 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete methods. (0.75 marks)
 *  > Write an implementation of the getall method you declared in the interface. (0.25 marks)
 *
 */
public class BookServiceImpl implements BookService {

    @Override
    public Book create(Book book) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Book update(Book book) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Book read(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(String s) {
        throw new UnsupportedOperationException();
    }
}
