package com.example.demo.pl.forms;

import java.util.List;
import lombok.Data;

@Data
public class libraryForm{

    String name;
    List<Long> bookId;
    Long user;
}
    
    
