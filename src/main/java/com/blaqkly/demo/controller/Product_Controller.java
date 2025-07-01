package com.blaqkly.demo.controller;


import com.blaqkly.demo.model.Product_model;
import com.blaqkly.demo.repo.productRepo;
import com.blaqkly.demo.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Product_Controller {

    @Autowired
    private productRepo repo;

    @PostMapping("/product")
    public ResponseEntity<Product_model> addProduct(@RequestBody Product_model products){
        Product_model savedProduct = repo.save(products);
        return ResponseEntity.ok(savedProduct);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product_model> getProductById( @PathVariable("id")  Long product_id){
      Product_model product=  repo.findById(product_id)
                .orElseThrow(()->

                     new ResourceNotFoundException("Product with Id does not exist" ));
            return ResponseEntity.ok(product);
    };

    //TODO: fetch everything in ascending order
    @GetMapping("/products")
    public ResponseEntity<List<Product_model>> getAllProducts(){
        List<Product_model> products = repo.findAll();
        return ResponseEntity.ok(products);
    }

    //this needs refactoring
    @PutMapping("/product/{id}")
    public ResponseEntity<Product_model>UpdateProduct(@PathVariable("id") Long product_id, @RequestBody Product_model products){
        Product_model updateThis = repo.findById(product_id).orElseThrow(()->
                new ResourceNotFoundException("Product with Id does not exist" ));

        updateThis.setName(products.getName());
        updateThis.setPrice(products.getPrice());
        updateThis.setSizes(products.getSizes());
        updateThis.setDesigner(products.getDesigner());
        updateThis.setType(products.getType());
        updateThis.setDescription(products.getDescription());
        updateThis.setCategory(products.getCategory());
        updateThis.setImage(products.getImage());
        updateThis.setCare_instructions(products.getCare_instructions());


        Product_model updatedProduct = repo.save(updateThis);
        return ResponseEntity.ok(updatedProduct);

    };

    @DeleteMapping("/product/{id}")
    public ResponseEntity<String>DeleteProduct(@PathVariable ("id") Long product_id){

         repo.findById(product_id)
                .orElseThrow(()->
                        new ResourceNotFoundException("Product with Id does not exist" ));
                     repo.deleteById(product_id) ;
        return ResponseEntity.ok("Product Successfully Deleted");

    }

}
