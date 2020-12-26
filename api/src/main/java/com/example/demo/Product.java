package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Products")
public class Product {
    @Id
    @Column(name = "productId")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int productId;
    @Column(name = "description")
    private String description;
    @Column(name = "name")
    private String name ;
    @Column(name = "availability")
    private boolean is_available;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category_id;

    public int getProduct_id() {
        return productId;
    }
    public String get_name() {
        return name;
    }
    public void set_name(String name) {
        this.name = name;
    }
    public Category get_category_id() { return category_id; }
    public void set_category_id(Category category_id) { this.category_id = category_id; }
    public String get_description() {
        return description;
    }
    public void set_description(String description) {

        this.description = description;
    }
    public String get_availability() {
        return description;
    }
    public void set_availability(boolean is_available) {
        this.is_available = is_available;
    }
}