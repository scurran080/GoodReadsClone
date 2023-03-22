package com.betterreads.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/book", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping(path = "/create")
    public Book createBook(Book book){
        bookService.createBook(book);
        return book;
    }

    @GetMapping(path = "/get/{id}")
    public Optional<Book> getById(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @GetMapping(path = "/get/{title}")
    public Optional<List<Book>> getByTitle(@PathVariable String title){
        return bookService.getBookByTitle(title);
    }

    @GetMapping(path = "/getAll")
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @PutMapping(path = "/update/{id}")
    public Book updateBook(@PathVariable Long id, Book bookInfo){
        return null;
    }
}
