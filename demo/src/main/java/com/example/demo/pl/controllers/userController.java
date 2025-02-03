package com.example.demo.pl.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bl.userService;
import com.example.demo.pl.DTO.UserDTO;
import com.example.demo.pl.forms.userForm;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class userController {

    private userService userService; 

    public userController(userService userService){

        this.userService = userService; 
    }
    
    
    @PreAuthorize("isAnonymous()")
    @PostMapping("/create")
    public void createUser(@RequestBody userForm form){

        userService.create(form);
    }

    @PreAuthorize("isAuthenticated()")
    @PutMapping("/update/profil/{id}")
    public void updateProfi(userForm form, @PathVariable Long id){
        userService.update(form, id);
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/profil/{id}")
    public ResponseEntity<UserDTO> getOne(@PathVariable Long id){
        return ResponseEntity.ok(UserDTO.fromEntity(userService.getOne(id)));
    }
}
