package com.example.demo.model;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Payment")
public class Payment {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "paymentId")
        private int paymentId;
        @Column(name = "added_date")
        private  LocalDate added_date;
        @Column(name = "is_active")
        private boolean is_active;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user_id;

    public void set_user_id(User user_id) {
        this.user_id = user_id;
    }

    public User get_user_id() {
        return user_id;
    }

    public void set_added_date(LocalDate added_date) {
        this.added_date = added_date;
    }

    public void set_is_active(boolean is_active) {
        this.is_active = is_active;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public LocalDate get_added_date() {
        return added_date;
    }

    public boolean get_is_active() {
        return is_active;
    }
}
