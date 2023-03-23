package com.betterreads.repository;

import com.betterreads.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query(value = "SELECT author FROM author WHERE author.id = :#{#id}", nativeQuery = true)
    public Author getById(@Param("id") Long id);

}
