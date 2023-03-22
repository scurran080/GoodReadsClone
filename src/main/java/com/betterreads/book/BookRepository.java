package com.betterreads.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

    @Query(value = "SELECT book FROM Book WHERE book.id = :#{#id}")
    Optional<Book> getBookById(@Param("id") Long id);

    @Query(value = "SELECT book FROM Book WHERE book.title = :#{#title}")
    Optional<List<Book>> getBookByTitle(@Param("title") String title);

}
