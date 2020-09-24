package com.caniksea.adp3.practical.booklib.authormodule.repository.generic.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.repository.generic.AuthorRepository;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in AuthorRepository.java before attempting the tasks below.
 *
 * Tasks:
 *  > Implement repository using singleton and your chosen Java data structure. (1.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create methods. (0.25 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read methods. (0.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the update methods. (0.75 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete methods. (0.75 marks)
 *  > Write an implementation of the getall method you declared in the interface. (0.25 marks)
 *
 */
public class AuthorRepositoryImpl implements AuthorRepository {

    @Override
    public Author create(Author author) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Author update(Author author) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Author read(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(String s) {
        throw new UnsupportedOperationException();
    }
}
