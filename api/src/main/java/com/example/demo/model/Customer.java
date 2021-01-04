
package com.example.demo.model;

import java.util.*;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Customer extends User {

    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "personal_discount")
    private double personalDiscount;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getPersonalDiscount() {
        return personalDiscount;
    }

    public void setPersonalDiscount(double personalDiscount) {
        this.personalDiscount = personalDiscount;
    }

    @Override
    public Roles getRole() {
        return Roles.CUSTOMER;
    }
}
