package com.example.demo;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Categories")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "categoryId")
    private int categoryId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToMany
    @JoinColumn(name="subcategory_id")
    private Set<Category> subcategories;

    public void set_name(String name) {
        this.name = name;
    }

    public void set_description(String description) {
        this.description = description;
    }

    public void set_subcategories(Set<Category> subcategories) {
        this.subcategories = subcategories;
    }

    public String get_name() {
        return name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public Set<Category> get_subcategories() {
        return subcategories;
    }

    public String get_description() {
        return description;
    }
}
