package com.example.demo1.dtos;

import com.example.demo1.entities.User;
import lombok.Data;

@Data
public class UserDTO {

  private String name;

  private String email;

  public static UserDTO toUserDTO(User user){
    UserDTO userDTO= new UserDTO();
    userDTO.setEmail(user.getEmail());
    userDTO.setName(user.getName());
    return userDTO;
  }

}
