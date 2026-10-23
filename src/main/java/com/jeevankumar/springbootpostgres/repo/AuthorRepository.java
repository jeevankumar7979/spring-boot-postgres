package com.jeevankumar.springbootpostgres.repo;

import com.jeevankumar.springbootpostgres.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
