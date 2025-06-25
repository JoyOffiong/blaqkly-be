package com.blaqkly.demo.service;

import com.blaqkly.demo.model.Product_model;
import org.springframework.stereotype.Service;

@Service
public interface Product_service {
    Product_model addProduct(Product_model Product_model);
    Product_model getProductById(Long product_id);
}
