
package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="Customers")
public class Customer extends User {
    //inhereted id from User?
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
}
