package com.example.demo.bl;

import java.util.List;
import java.util.Optional;

import com.example.demo.dal.models.entities.Book;
import com.example.demo.pl.forms.bookForm;


public interface bookService {

    void create(bookForm bookForm);
    Optional<Book> getOne(Long id); 
    void delete(Long id); 
    List<Book> getAll(); 
    
} 