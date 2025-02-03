package com.example.demo.bl.impl;


import com.example.demo.dal.models.entities.library;
import com.example.demo.bl.libraryService;
import com.example.demo.dal.repository.libraryRepository;
import com.example.demo.dal.repository.userRepository;
import com.example.demo.pl.forms.libraryForm;
import com.example.demo.pl.forms.userForm;

import jakarta.persistence.EntityNotFoundException;

public class libraryServiceImpl implements libraryService {

    private final libraryRepository libraryRepository; 
    private final userRepository userRepository;

    public libraryServiceImpl(libraryRepository libraryRepository, userRepository userRepository){

        this.libraryRepository = libraryRepository; 
        this.userRepository = userRepository;
    }

    @Override
    public void create(libraryForm libraryForm) {
        
       if(libraryForm == null){
        throw new IllegalArgumentException("Le formulaire ne peut pas être vide");
       }


       library library = new library(); 

       library.setName(libraryForm.getName()); 
       library.setUser(userRepository.findById(libraryForm.getUser()).orElseThrow(() -> new EntityNotFoundException("User not found")));      
       
       libraryRepository.save(library); 

    }
    
}
