package com.betterreads.service;

import com.betterreads.models.BookShelf;
import com.betterreads.repository.BookShelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookShelfService {

    private final BookShelfRepository bookShelfRepository;

    @Autowired
    public BookShelfService(BookShelfRepository bookShelfRepository){
        this.bookShelfRepository = bookShelfRepository;
    }

    public void createBookShelf(BookShelf bookShelf){
        bookShelfRepository.save(bookShelf);
    }

}
