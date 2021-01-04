package com.example.demo;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.security.access.prepost.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

  @Autowired
  private CustomerRepository customerRepository;

  @CrossOrigin
  @GetMapping("/login")
  public String login(){
    return "OK";
  }

  @CrossOrigin
  @RequestMapping(value = "/register", method = RequestMethod.POST,
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity register(@RequestBody Customer customer){
    customerRepository.save(customer);
    return ResponseEntity.ok(HttpStatus.OK);
  }
}
