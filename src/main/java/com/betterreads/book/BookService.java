package com.betterreads.book;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void createBook(Book newBook){
        bookRepository.save(newBook);
    }

    public Optional<List<Book>> getBookByTitle(String title){
        return bookRepository.getBookByTitle(title);
    }

    public Optional<Book> getBookById(Long id){
        return bookRepository.getBookById(id);
    }

    public List<Book> getAll(){
        return bookRepository.findAll();
    }


}
