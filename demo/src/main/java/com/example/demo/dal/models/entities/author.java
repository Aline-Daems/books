package com.example.demo.dal.models.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;

@Entity
public class author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    @NotNull
    private String firstname; 

    @NotNull
    private String lastname; 


    public author(Long id, String firstname, String lastname) { 

        this.id = id;
        this.firstname = firstname; 
        this.lastname = lastname;
    }

    public Long getId(){

        return id; 
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getfirstName(){

        return firstname; 
    }

    public void setfirstName(String firstname){

        this.firstname=firstname; 
    }

    public String getlastName(){

        return lastname; 
    }

    public void setlastName(String lastname){

        this.lastname=lastname; 
    }
}