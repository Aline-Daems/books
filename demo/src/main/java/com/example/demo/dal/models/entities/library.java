package com.example.demo.dal.models.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import jakarta.persistence.JoinColumn;
import org.hibernate.annotations.ManyToAny;



import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class library {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    @NotNull
    private String name; 

    @JoinTable(name="libraryBook", joinColumns = @JoinColumn(name="libraryId"), inverseJoinColumns = @JoinColumn(name="bookId"))
    @ManyToAny
    private List<Book> books = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="id")
    private user user;


    public library() {

    }


   

}