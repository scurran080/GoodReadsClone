package com.betterreads.service;

import com.betterreads.models.Author;
import com.betterreads.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public void createAuthor(Author author){
        this.authorRepository.save(author);
    }

    public Author getById(Long id){
        return this.authorRepository.getById(id);
    }

}
