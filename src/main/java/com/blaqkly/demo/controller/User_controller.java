package com.blaqkly.demo.controller;

import com.blaqkly.demo.repo.Create_userRepo;
import com.blaqkly.demo.model.Users_model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class User_controller {

    @Autowired
   private Create_userRepo repo;

  @PostMapping("/auth/register")
  public ResponseEntity<Users_model> addUser(@RequestBody Users_model user){
   Users_model savedUser = repo.save(user); //this line saves the user to the database
      return ResponseEntity.ok(savedUser);
  }

}
