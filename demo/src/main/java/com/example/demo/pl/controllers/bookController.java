package com.example.demo.pl.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bl.bookService;
import com.example.demo.pl.forms.bookForm;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class bookController {

    private bookService bookService; 

    public bookController(bookService bookService){
        this.bookService = bookService; 
    }


    @PreAuthorize("isAuthenticated()")
    @PostMapping("/create")
    public void createBook(@RequestBody bookForm bookForm){

        bookService.create(bookForm);
    }
    
}
