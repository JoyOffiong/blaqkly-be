package com.blaqkly.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDto {

    private Long product_id;


    private String name;


    private Integer price;

    private String sizes;

    private String designer;


    private String type;

    private String description;

    private String category;

    private String image;

    private String care_instructions;
}
