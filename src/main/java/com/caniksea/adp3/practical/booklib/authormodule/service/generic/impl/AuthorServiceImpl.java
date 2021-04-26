package com.caniksea.adp3.practical.booklib.authormodule.service.generic.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.repository.generic.AuthorRepository;
import com.caniksea.adp3.practical.booklib.authormodule.repository.generic.impl.AuthorRepositoryImpl;
import com.caniksea.adp3.practical.booklib.authormodule.service.generic.AuthorService;

import java.util.HashSet;
import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in AuthorService.java before attempting the tasks below.
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
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository repository;
    private static AuthorService service = null;

    private AuthorServiceImpl() {
        this.repository = AuthorRepositoryImpl.getRepository();
    }

    public static AuthorService getService() {
        if (service == null) service = new AuthorServiceImpl();
        return service;
    }

    @Override
    public Author create(Author author) {
        return this.repository.create(author);
    }

    @Override
    public Author update(Author author) {
        return this.repository.update(author);
    }

    @Override
    public Author read(String s) {
        return this.repository.read(s);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Set<Author> getall() {
        return this.repository.getall();
    }

    @Override
    public Set<Author> getAuthorsWithLastName(String lastName) {
        Set<Author> authors = getall();
        Set<Author> result = new HashSet<>();
        for(Author author: authors) {
            if (author.getLastName().equalsIgnoreCase(lastName)) {
                result.add(author);
            }
        }
        return result;
    }
}
