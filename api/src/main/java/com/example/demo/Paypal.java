package com.example.demo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Paypal")
public class Paypal extends Payment {
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;

    public void set_email(String email) {
        this.email = email;
    }

    public void set_username(String username) {
        this.username = username;
    }

    public String get_username() {
        return username;
    }

    public String get_email() {
        return email;
    }
}
