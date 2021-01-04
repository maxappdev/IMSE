package com.example.demo.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="Orders")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "orderId")
    private int orderId;
    @Column(name = "is_paid")
    private boolean is_paid;
    @Column(name = "is_delivered")
    private boolean is_delivered;
    @Column(name = "is_cancelled")
    private boolean is_cancelled;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "note")
    private String note;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user_id;
    @ManyToOne
    @JoinColumn(name="payment_info_id")
    private Payment payment_info_id ;
    @ManyToMany
    Set<Product> products;

    public void set_payment_info_id(Payment payment_info_id) {
        this.payment_info_id = payment_info_id;
    }

    public void set_products(Set<Product> products) {
        this.products = products;
    }

    public Set<Product> get_products() {
        return products;
    }

    public void set_date(LocalDate date) {
        this.date = date;
    }

    public void set_is_cancelled(boolean is_cancelled) {
        this.is_cancelled = is_cancelled;
    }

    public void set_is_delivered(boolean is_delivered) {
        this.is_delivered = is_delivered;
    }

    public void set_is_paid(boolean is_paid) {
        this.is_paid = is_paid;
    }

    public void set_note(String note) {
        this.note = note;
    }

    public void set_user_id(User user_id) {
        this.user_id = user_id;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDate get_date() {
        return date;
    }

    public String get_note() {
        return note;
    }

    public Payment get_payment_info_id() {
        return payment_info_id;
    }

    public User get_user_id() {
        return user_id;
    }

}
