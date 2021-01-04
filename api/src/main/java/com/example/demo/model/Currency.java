package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Currencies")
public class Currency {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "currencyId")
    private int currenyId;
    @Column(name = "name")
       private  String name;
    @Column(name = "symbol")
       private char symbol;

    public void set_name(String name) {
        this.name = name;
    }

    public void set_symbol(char symbol) {
        this.symbol = symbol;
    }

    public String get_name() {
        return name;
    }

    public int getCurrenyId() {
        return currenyId;
    }

    public char get_symbol() {
        return symbol;
    }
}
