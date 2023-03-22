package com.betterreads.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = "SELECT user FROM User WHERE user.id = :#{#id}")
    public User getUserById(@Param("id") Long id);

    @Query(value = "SELECT user FROM User WHERE user.username = :#{#username}")
    public User getUserByUsername(@Param("username") String username);
}
