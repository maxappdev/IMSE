package com.example.demo;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import java.time.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        SessionFactory sessionFactory =
            new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Admin admin = new Admin();
        admin.setFirstname("Admin");
        admin.setLastname("Adminovich");
        admin.setEmail("email@mail.com");
        admin.setActive(true);
        admin.setUsername("admin");
        admin.setPassword("123");
        admin.setLastLoginDate(new Date());
        admin.setWebsiteOwner(true);

        session.save(admin);
        transaction.commit();
        }

}