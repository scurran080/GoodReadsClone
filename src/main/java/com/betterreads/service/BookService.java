package com.betterreads.service;

import java.util.ArrayList;

import com.betterreads.models.Book;
import com.betterreads.repository.BookRepository;
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

    public ArrayList<Book> getBookByTitle(String title){
        return bookRepository.getBookByTitle(title);
    }

    public Book getBookById(Long id){
        return bookRepository.getBookById(id);
    }

    public ArrayList<Book> getAllBooks(){
        return bookRepository.getAllBooks();
    }


}
