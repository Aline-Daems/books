package com.example.demo.bl.impl;



import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.demo.bl.userService;
import com.example.demo.pl.forms.userForm;
import jakarta.persistence.EntityNotFoundException;
import com.example.demo.pl.forms.LoginForm;
import com.example.demo.pl.DTO.AuthDTO;
import com.example.demo.dal.models.entities.user;
import com.example.demo.dal.repository.userRepository;

@Service
public class userServiceImpl implements userService {

    private final userRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public userServiceImpl(userRepository userRepository, PasswordEncoder passwordEncoder){

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public user getOne(Long id){
        return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public void create(userForm form) {
        if(form == null){

            throw new IllegalArgumentException("Le formulaire ne peut être vide");
        }

        user user = new user(); 

        user.setName(form.getName());
        user.setEmail(form.getEmail()); 
        user.setPassword(passwordEncoder.encode(form.getPassword())); 
        user.setRoles(form.getRole()); 
    }

    @Override
    public void update(userForm form, Long id) {

        user user = userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        user.setName(form.getName());
        user.setEmail(form.getEmail()); 
        user.setPassword(passwordEncoder.encode(form.getPassword())); 
        user.setRoles(form.getRole()); 
    }


    @Override
    public AuthDTO login(LoginForm form) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }
}