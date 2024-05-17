package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
