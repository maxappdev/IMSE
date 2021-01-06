package com.example.demo.controller;


import com.example.demo.model.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.security.access.prepost.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;


    @CrossOrigin
    @RequestMapping(value = "/orderNew", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity newOrder(@RequestBody Order order){
        orderRepository.save(order);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
