package com.example.demo.bl;



import com.example.demo.pl.forms.userForm;
import com.example.demo.pl.forms.LoginForm;
import com.example.demo.pl.DTO.AuthDTO;


import com.example.demo.dal.models.entities.user;

public interface userService {

    void create(userForm form);

    AuthDTO login(LoginForm form);

    void update(userForm form, Long id);

    user getOne(Long id);
}