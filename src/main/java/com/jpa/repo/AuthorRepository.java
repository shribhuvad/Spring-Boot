package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
