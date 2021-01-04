package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name="Prices")
public class Price {
    @Id
    @Column(name = "priceId")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int price_id;
    @Column(name = "amount")
    private int amount;
    @Column(name = "is_active")
    private boolean is_active;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product products;
    //Country id or currency id?
    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;

    public void set_country(Country country) {
        this.country = country;
    }

    public void set_amount(int amount) {
        this.amount = amount;
    }

    public void set_is_active(boolean is_active) {
        this.is_active = is_active;
    }

    public void set_products(Product products) {
        this.products = products;
    }

    public int get_amount() {
        return amount;
    }

    public int getPrice_id() {
        return price_id;
    }

    public Product get_products() {
        return products;
    }

    public boolean get_is_active() {
        return is_active;
    }

    public Country get_country() {
        return country;
    }
}
