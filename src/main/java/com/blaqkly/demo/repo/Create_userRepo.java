package com.blaqkly.demo.repo;

import com.blaqkly.demo.model.Users_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Create_userRepo extends JpaRepository<Users_model, Long> {

}
