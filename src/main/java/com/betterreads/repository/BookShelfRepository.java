package com.betterreads.repository;

import com.betterreads.models.BookShelf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookShelfRepository extends JpaRepository<BookShelf, Long> {


}
