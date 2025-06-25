package com.blaqkly.demo.repo;

import com.blaqkly.demo.model.Product_model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepo extends JpaRepository<Product_model, Long> {

}
