package com.example.demo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Cities")
public class City {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "cityId")
    private int cityId;
    @Column(name = "name")
    private String name;
    @Column(name = "users_number")
    private int users_number;
    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country_id;

    public void set_country_id(Country country_id) {
        this.country_id = country_id;
    }

    public Country get_country_id() {
        return country_id;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_users_number(int users_number) {
        this.users_number = users_number;
    }

    public int getCityId() {
        return cityId;
    }

    public int get_users_number() {
        return users_number;
    }
    public String get_name() {
        return name;
    }


}
