package com.example.demo.model;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Card extends Payment {
    @Column(name = "number")
    private int number;
    @Column(name = "expiration_date")
    private LocalDate expiration_date;

    public void set_expiration_date(LocalDate expiration_date) {
        this.expiration_date = expiration_date;
    }

    public void set_number(int number) {
        this.number = number;
    }

    public LocalDate get_expiration_date() {
        return expiration_date;
    }

    public int get_number() {
        return number;
    }
}
