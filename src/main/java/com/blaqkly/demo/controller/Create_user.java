package com.blaqkly.demo.controller;

import com.blaqkly.demo.repo.Create_userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Create_user {

    @Autowired
   private Create_userRepo repo;

  @PostMapping("/auth/register")
  public ResponseEntity<com.blaqkly.demo.model.Create_user> addUser(@RequestBody com.blaqkly.demo.model.Create_user user){
      System.out.println("incoming user:" + user);
   com.blaqkly.demo.model.Create_user savedUser = repo.save(user); //this line saves the user to the database
      return ResponseEntity.ok(savedUser);
  }

}
