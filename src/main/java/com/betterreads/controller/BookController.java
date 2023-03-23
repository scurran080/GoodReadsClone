package com.betterreads.controller;

import com.betterreads.models.Book;
import com.betterreads.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/api/book", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/createBook")
    public Book createBook(@RequestBody Book book){
        bookService.createBook(book);
        return book;
    }

    @GetMapping(path = "/get/{id}")
    public Book getById(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @GetMapping(path = "/get/{title}")
    public ArrayList<Book> getByTitle(@PathVariable String title){
        return bookService.getBookByTitle(title);
    }

    @GetMapping(path = "/getAll")
    public ArrayList<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PutMapping(path = "/update/{id}")
    public Book updateBook(@PathVariable Long id, Book bookInfo){
        return null;
    }

    @GetMapping("/test")
    public String testConn(){
        return "Connection made";
    }

}
