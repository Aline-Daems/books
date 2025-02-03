package com.example.demo.pl.DTO;


import com.example.demo.dal.models.entities.user;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserDTO {

    private Long id; 
    private String name;
    private String email; 



    
    
        public static UserDTO fromEntity(user user) {
            return new UserDTO(user.getId(), user.getName(), user.getEmail());
    }

}


