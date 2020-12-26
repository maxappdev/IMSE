package com.example.demo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Admins")
public class Admin extends User {
    @Column(name = "last_login_date")
    private LocalDate last_login_date;
    @Column(name = "is_website_owner")
    private boolean is_website_owner ;

    void set_last_login_date(LocalDate last_login_date){this.last_login_date=last_login_date;}

    public LocalDate get_last_login_date() {
        return last_login_date;
    }
    void set_is_website_owner(boolean is_website_owner){this.is_website_owner=is_website_owner;}
    boolean get_is_website_owner(){
        return  is_website_owner;
    }
}
