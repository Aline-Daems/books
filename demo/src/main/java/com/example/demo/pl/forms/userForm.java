package com.example.demo.pl.forms;
import com.example.demo.dal.models.enums.Roles;

import lombok.Data;

@Data
public class userForm {
    String name;
    String email; 
    String password;
    Roles role;
}