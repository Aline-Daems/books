package com.example.demo.dal.models.entities;

import com.example.demo.dal.models.enums.Languages;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId; 
    @NotNull
    private String name; 
    @NotNull
    private String type;
    @NotNull
    private String version; 
    @NotNull
    private String description; 
    @NotNull
    @Enumerated(EnumType.STRING)
    private Languages language;
    private LocalDate datePublication; 
    private String picture; 

    @ManyToMany(mappedBy = "books") // Indique que la relation est déjà définie dans Library
    private List<library> libraries = new ArrayList<>();


    public Book(Long id, String name, String type, String version, String description, Languages language, LocalDate datePublication, String picture){

        this.bookId = id; 
        this.name = name; 
        this.type = type; 
        this.version = version; 
        this.description = description; 
        this.language = language; 
        this.datePublication = datePublication; 
        this.picture = picture; 
    }

    public Book() {
   
    }

    public Long getId(){

        return bookId; 
    }

    public void setId(Long id){
        this.bookId = id;
    }

    public String getName(){

        return name; 
    }

    public void setName(String name){

        this.name=name; 
    }

    public String getType(){

        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getVersion(){
        return version;
    }
    public void setVersion(String version){

        this.version = version;
    }

    public Languages getLanguage(){
        return language;
    }

    public void setLanguage(Languages language){
        this.language = language;
    }

    public LocalDate getdatePublication(){

        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication){

        this.datePublication = datePublication; 
    }

}