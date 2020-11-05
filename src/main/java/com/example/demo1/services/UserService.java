package com.example.demo1.services;

import com.example.demo1.dtos.UserDTO;
import com.example.demo1.entities.User;
import com.example.demo1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public ResponseEntity<?> create(UserDTO userDTO){
    User user = new User();
    user.setEmail(userDTO.getEmail());
    user.setName(userDTO.getName());
    userRepository.save(user);
    return ResponseEntity.ok(user);
  }

}
