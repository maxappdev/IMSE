package com.example.demo.repository;

import com.example.demo.model.*;
import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

  User findUserByUsername(String username);
}
