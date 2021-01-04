package com.example.demo.repository;

import com.example.demo.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

  Customer findCustomerByUsername(String username);
}
