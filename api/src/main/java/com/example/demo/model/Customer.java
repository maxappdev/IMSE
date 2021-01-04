
package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Customer extends User {


    @Column(name = "birth_date")
    private LocalDate birth_date;
    @Column(name = "personal_discount")
    private double personal_discount;


    public void set_birth_date(LocalDate birth_date) {
        this.birth_date = birth_date;

    }

    public void set_personal_discount(double personal_discount) {
        this.personal_discount = personal_discount;
    }




    public double get_personal_discount() {
        return personal_discount;
    }

    public LocalDate get_birth_date() {
        return birth_date;
    }

    @Override
    public Role getRole() {
        return Role.CUSTOMER;
    }
}
