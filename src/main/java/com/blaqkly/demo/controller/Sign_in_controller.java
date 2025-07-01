package com.blaqkly.demo.controller;


import com.blaqkly.demo.model.Sign_in_model;
import com.blaqkly.demo.repo.Create_userRepo;
import com.blaqkly.demo.model.Users_model;

import com.blaqkly.demo.service.exceptions.ErrorResponse;
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
public class Sign_in_controller {

    @Autowired
    private Create_userRepo userRepository;


    @PostMapping("/auth/sign-in")
    public ResponseEntity<?> fetchUser(@RequestBody Sign_in_model loginRequest) {
        Optional<Users_model> optionalUser = userRepository.findByEmail(loginRequest.getEmail());


        if (optionalUser.isPresent()) {
            Users_model user = optionalUser.get();

            if (!user.getPassword().equals(loginRequest.getPassword())) {

                ErrorResponse error = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), "Bad Request", "Invalid Credentails");
                return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
            }

            return ResponseEntity.ok(user);

        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User does not exist");

        }
    };
}
