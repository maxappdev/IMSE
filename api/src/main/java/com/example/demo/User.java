
package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int user_id;
    private String username;
    private String user_firstname;
    private String user_lastname;
    private String user_email;
    private boolean is_active;
    public void setUser_id(int user_id){this.user_id= user_id;}
    public void setUsername(String username){this.username=username;}
    public void setUser_firstname(String user_firstname){this.user_firstname=user_firstname;}
    public void setUser_lastname(String user_lastname){this.user_lastname=user_lastname;}
    public void setUser_email(String user_email) {this.user_email=user_email;}
    public void setIs_active(boolean is_active){this.is_active=is_active;}

    public int getUser_id() {
        return user_id;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_firstname() {
        return user_firstname;
    }

    public String getUser_lastname() {
        return user_lastname;
    }

    public String getUsername() {
        return username;
    }
    public boolean getIs_active(){
        return is_active;
    }
}
