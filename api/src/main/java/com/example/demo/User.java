
package com.example.demo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "userId")
    private int userId;
    @Column(name = "username")
    private String username;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "activity")
    private boolean is_active;


    public void set_username(String username){this.username=username;}
    public void set_firstname(String firstname){this.firstname=firstname;}
    public void set_lastname(String lastname){this.lastname=lastname;}
    public void set_email(String email) {this.email=email;}
    public void set_is_active(boolean is_active){this.is_active=is_active;}


    public int getUserid() {
        return userId;
    }

    public String get_email() {
        return email;
    }

    public String get_firstname() {
        return firstname;
    }

    public String get_lastname() {
        return lastname;
    }

    public String get_username() {
        return username;
    }
    public boolean get_is_active(){
        return is_active;
    }
}
