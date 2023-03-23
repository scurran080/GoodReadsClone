package com.betterreads.models;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;
    private String publisher;
    private String isbn;

    private String description;
    private ArrayList<BookGenre> tags;
    private Float rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<BookGenre> getTags() {
        return tags;
    }

    public void setTags(ArrayList<BookGenre> tags) {
        this.tags = tags;
    }

    public void addTag(BookGenre newTag){
        this.tags.add(newTag);
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

}
