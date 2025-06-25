package com.blaqkly.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="products")
public class Product_model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="product_id")
    @JsonProperty("product_id")
    private Long product_id;

    @Column(name="name")
    @JsonProperty("name")
    private String name;

    @Column(name="price")
    @JsonProperty("price")
    private Integer price;

    @Column(name="sizes")
    @JsonProperty("sizes")
    private String sizes;

    @Column(name="designer")
    @JsonProperty("designer")
    private String designer;

    @Column(name="type")
    @JsonProperty("type")
    private String type;

    @Column(name="description")
    @JsonProperty("description")
    private String description;

    @Column(name="category")
    @JsonProperty("category")
    private String category;

    @Column(name="image")
    @JsonProperty("image")
    private String image;

    @Column(name="care_instructions")
    @JsonProperty("care_instructions")
    private String care_instructions;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Long getProduct_id() { return product_id; }
    public void setProduct_id(Long product_id) { this.product_id = product_id; }

    public String getCare_instructions() { return care_instructions; }
    public void setCare_instructions(String care_instructions) { this.care_instructions = Product_model.this.care_instructions; }

    public String getSizes() { return sizes; }
    public void setSizes(String sizes) { this.sizes = sizes; }

    public int getPrice() { return price; }
    public void setPrice(Integer price) { this.price = price; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getDesigner() { return designer; }
    public void setDesigner(String designer) { this.designer = designer; }

    public String getCategory() { return category; }
    public  void setCategory(String category) { category = category; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    @Override
    public String toString(){
        return "Create_product{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", sizes='" + sizes + '\'' +
                ", price='" + price + '\'' +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                ", designer='" + designer + '\'' +
                ", image='" + image + '\'' +
                ", description=" + description +
                ", care_instructions='" + care_instructions + '\'' +
                '}';    }


}
