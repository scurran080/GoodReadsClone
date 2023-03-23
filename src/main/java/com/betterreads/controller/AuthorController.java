package com.betterreads.controller;


import com.betterreads.service.AuthorService;
import com.betterreads.models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/author", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthorController {

    private final AuthorService authorService;
    @Autowired
    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @PostMapping(path = "/create")
    public void createAuthor(Author author){
        this.authorService.createAuthor(author);
    }

    @GetMapping(path = "/getById/{id}")
    public Author getById(@PathVariable("id") Long id){
        Author author = this.authorService.getById(id);
        return author;
    }


}
