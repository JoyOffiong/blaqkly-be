package com.blaqkly.demo.controller;

import com.blaqkly.demo.repo.Create_userRepo;
import com.blaqkly.demo.model.Users_model;
import com.blaqkly.demo.service.exceptions.ErrorResponse;
import com.blaqkly.demo.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class User_controller {

    @Autowired
   private Create_userRepo repo;

  @PostMapping("/auth/register")
  public ResponseEntity<?> addUser(@RequestBody Users_model user){
      Optional<Users_model> optionalUser = repo.findByEmail(user.getEmail());

      if(optionalUser.isPresent()) {
          ErrorResponse error = new ErrorResponse(
                  HttpStatus.BAD_REQUEST.value(), "Bad Request", "Email already exists"
          );
return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
      }

 else{
          Users_model savedUser = repo.save(user);
          return ResponseEntity.ok(savedUser);
      }
  }

}
