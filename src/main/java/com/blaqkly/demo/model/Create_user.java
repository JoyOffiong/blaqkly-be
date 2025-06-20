package com.blaqkly.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import com.blaqkly.demo.enums.User_roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="app_user")
public class Create_user {
    @Id     //this here shows that the primary key is ID
   @GeneratedValue(strategy = GenerationType.IDENTITY) //this allows postgres to increment the amount
    private Long id;

    @Column(name = "user_name")
    @JsonProperty("userName")
    private String userName;

    @Column(name = "email")
    @JsonProperty("email")
    private String email;

    @Column(name="password")
    @JsonProperty("password")
    private String password;

    @Enumerated(EnumType.STRING )  //this stores the enum as a string
    @Column(name="role")
    @JsonProperty("role")
    private User_roles role;

 @Override
 public String toString() {
  return "Create_user{" +
          "id=" + id +
          ", userName='" + userName + '\'' +
          ", email='" + email + '\'' +
          ", password='" + password + '\'' +
          ", role=" + role +
          '}';
 }
}