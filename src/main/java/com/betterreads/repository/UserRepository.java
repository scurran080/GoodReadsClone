package com.betterreads.repository;

import com.betterreads.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT user FROM User WHERE user.id = :#{#id}", nativeQuery = true)
    public User getUserById(@Param("id") Long id);

    @Query(value = "SELECT user FROM user WHERE user.username = :#{#username}", nativeQuery = true)
    public User getUserByUsername(@Param("username") String username);
}
