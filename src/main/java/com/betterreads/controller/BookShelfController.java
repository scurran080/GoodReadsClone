package com.betterreads.controller;

import com.betterreads.service.BookShelfService;
import com.betterreads.models.BookShelf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/api/bookshelf", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookShelfController {

    private final BookShelfService bookShelfService;

    @Autowired
    public BookShelfController(BookShelfService bookShelfService){
        this.bookShelfService = bookShelfService;
    }

    @PostMapping(path = "/create")
    public void createBookShelf(BookShelf bookShelf){
        this.bookShelfService.createBookShelf(bookShelf);
    }

}
