package com.blaqkly.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Sign_in {

@Column(name ="user_name")
    @JsonProperty("userName")
    private String userName;

@Column(name="email")
    @JsonProperty("email")
    private  String email;
}
