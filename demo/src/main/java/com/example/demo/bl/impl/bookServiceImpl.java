package com.example.demo.bl.impl;

import java.util.List;
import java.util.Optional;

import com.example.demo.bl.bookService;
import com.example.demo.dal.models.entities.Book;
import com.example.demo.dal.repository.bookRepository;
import com.example.demo.pl.forms.bookForm;

public class bookServiceImpl implements bookService {

    private final bookRepository bookRepository; 

    public bookServiceImpl(bookRepository bookRepository){

        this.bookRepository = bookRepository; 
    }

    @Override
    public void create(bookForm bookForm) {
      if(bookForm == null) {
        throw new IllegalArgumentException("Le formulaire ne peut pas être vide");
      }

      Book book = new Book(); 

      book.setName(bookForm.name()); 
      book.setType(bookForm.type());
      book.setVersion(bookForm.version());
      book.setDescription(bookForm.description());
      book.setLanguage(bookForm.language());
      book.setDatePublication(bookForm.datePublication());
      book.setPicture(bookForm.picture());
      bookRepository.save(book);
    }

    @Override
    public Optional<Book> getOne(Long id) {
      return bookRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Book> getAll() {
      return bookRepository.findAll(); 
    }
    
}
