package com.example.demo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Countries")
public class Country {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "countryId")
    private int countryId;
    @Column(name = "name")
    String name;
    @Column(name = "umst")
    private String umst;
    @OneToOne
    @JoinColumn(name = "currency_id")
    private Currency currency_id;

    public void set_name(String name) {
        this.name = name;
    }

    public void set_umst(String umst) {
        this.umst = umst;
    }

    public int getCountryId() {
        return countryId;
    }

    public String get_name() {
        return name;
    }

    public String get_umst() {
        return umst;
    }
}

