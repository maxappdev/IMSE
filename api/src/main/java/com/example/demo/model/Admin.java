package com.example.demo.model;

import java.util.*;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Admin extends User {

    @Column(name="last_login_date") private Date lastLoginDate;
    @Column(name="is_website_owner") private boolean isWebsiteOwner ;

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public boolean isWebsiteOwner() {
        return isWebsiteOwner;
    }

    public void setWebsiteOwner(boolean websiteOwner) {
        isWebsiteOwner = websiteOwner;
    }

    @Override
    public Role getRole() {
        return Role.ADMIN;
    }
}
