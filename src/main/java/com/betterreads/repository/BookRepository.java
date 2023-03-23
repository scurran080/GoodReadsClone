package com.betterreads.repository;

import com.betterreads.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.ArrayList;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query(value = "SELECT book FROM book WHERE book.id = :#{#id}", nativeQuery = true)
    Book getBookById(@Param("id") Long id);

    @Query(value = "SELECT * FROM book WHERE book.title LIKE :#{#title}", nativeQuery = true)
    ArrayList<Book >getBookByTitle(@Param("title") String title);

    @Query(value="SELECT * FROM book", nativeQuery = true)
    ArrayList<Book> getAllBooks();

}
