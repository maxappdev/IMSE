package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="Addresses")
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "addressId")
    private int addressId;
    @Column(name = "street")
    private String street;
    @Column(name = "postcode")
    private int postcode;
    @Column(name = "house")
    private int house;
    @OneToOne
    @JoinColumn(name = "city_id")
    private City city_id;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user_id;

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public void set_user_id(User user_id) {
        this.user_id = user_id;
    }

    public void set_city_id(City city_id) {
        this.city_id = city_id;
    }

    public void set_house(int house) {
        this.house = house;
    }

    public void set_postcode(int postcode) {
        this.postcode = postcode;
    }

    public void set_street(String street) {
        this.street = street;
    }

    public int getAddressId() {
        return addressId;
    }

    public int get_house() {
        return house;
    }

    public int get_postcode() {
        return postcode;
    }

    public String get_street() {
        return street;
    }

    public City get_city_id() {
        return city_id;
    }

    public User get_user_id() {
        return user_id;
    }
}
