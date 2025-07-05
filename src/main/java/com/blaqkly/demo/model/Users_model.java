package com.blaqkly.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import com.blaqkly.demo.enums.User_roles;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="app_user")
public class Users_model {
    @Id     //this here shows that the primary key is ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //this allows postgres to increment the amount
    private Long id;

    @Column(name = "first_name")
    @JsonProperty("firstName")
    private String firstName;

    @Column(name = "last_name")
    @JsonProperty("lastName")
    private String lastName;

    @Column(name = "user_name")
    @JsonProperty("userName")
    private String userName;

    @Column(name = "email", nullable= false, unique = true)
    @JsonProperty("email")
    private String email;

    @Column(name = "phoneNumber", nullable= false, unique = true)
    @JsonProperty("phoneNumber")
    private String phoneNumber;


    @Column(name="password")
    @JsonProperty("password")
    private String password;

    @Column(name="gender")
    @JsonProperty("gender")
    private String gender;

    @Enumerated(EnumType.STRING )  //this stores the enum as a string
    @Column(name="role")
    @JsonProperty("role")
    private User_roles role;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User_roles getRole() {
        return role;
    }

    public void setRole(User_roles role) {
        this.role = role;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
 public String toString() {
  return "Create_user{" +
          "id=" + id +
          ", firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          ", userName='" + userName + '\'' +
          ", email='" + email + '\'' +
          ", gender='" + gender + '\'' +
          ", password='" + password + '\'' +
          ", role=" + role + '\'' +
         ", phoneNumber=" + phoneNumber +
          '}';
 }
}