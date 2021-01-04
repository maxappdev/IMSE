package com.example.demo;

import com.example.demo.model.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

  @CrossOrigin
  @GetMapping("/test")
  public String test(){

    return "created";
  }
}
