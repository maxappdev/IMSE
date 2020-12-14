package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="Products")
public class Product {
    @Id
    @Column(name = "productid")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int product_id;
    @Column(name = "description")
    private String description;
    public Product(){}
    public int getProduct_id() {
        return product_id;
    }
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}