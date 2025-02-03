package com.example.demo.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dal.models.entities.Book;

public interface bookRepository extends JpaRepository<Book, Long>{

}