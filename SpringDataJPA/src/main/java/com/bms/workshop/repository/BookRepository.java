package com.bms.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.workshop.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
