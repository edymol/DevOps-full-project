package com.digiaxix.restaurantusermanagement.controllers;

import com.digiaxix.restaurantusermanagement.entities.Users;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")


public class UserController {

    @Autowired
    private Environment environment;

    @GetMapping("/status/check")
    public String status(){
        return "OK" + environment.getProperty("local.server.port");
    };

    @PostMapping("/register")
    public String createUser(@RequestBody Users user){
        return "OK on port # " + environment.getProperty(" local.server.port");
    }

    @DeleteMapping("/delete")
    public String deleteUser(){
        return "OK on port # " + environment.getProperty(" local.server.port");
    }

    @PutMapping("users")
    public String updateUser(){
        return "OK on port # " + environment.getProperty(" local.server.port");
    }

}
