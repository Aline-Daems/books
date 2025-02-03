package com.example.demo.pl.forms;

import java.time.LocalDate;

import com.example.demo.dal.models.enums.Languages;

public record bookForm(

Long bookId,
String name, 
String type, 
String version, 
String description, 
Languages language, 
LocalDate datePublication, 
String picture
) {};