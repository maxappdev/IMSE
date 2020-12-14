package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="Admins")
public class Admin extends User {
    //inhereted id from User?
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
}
