package com.example.demo.dal.models.entities;


import com.example.demo.dal.models.enums.Roles;
import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name = "user_")
public class user{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    
    @NotNull
    private String name; 
    
    @NotNull
    private String email; 
    
    @NotNull
    private String password; 

    @Enumerated(EnumType.STRING)
    private Roles roles;
    
    @ManyToMany(mappedBy = "books")
    private List<Book> books = new ArrayList<>(); 


    public Long getId(){

        return id; 
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){

        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password){

        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

}