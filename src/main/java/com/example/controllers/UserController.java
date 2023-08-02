package com.example.controllers;

import com.example.exceptions.EmailAlreadyInUseException;
import com.example.exceptions.InvalidAgeException;
import com.example.services.UserService;
import com.example.models.User;
import com.example.validators.UserRegisterFormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    UserRegisterFormValidator userRegisterFormValidator;


//    @PostMapping
//    @RequestMapping("/auth/login")
//    private ResponseEntity login(){
//
//    }

    @PostMapping
    @RequestMapping("/auth/register")
    public ResponseEntity<String> register(@RequestBody User user){
        try{
            userRegisterFormValidator.validateUser(user);
        }catch (InvalidAgeException | EmailAlreadyInUseException ex){
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }

        userService.createUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    @RequestMapping("/")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("I'm alive!", HttpStatus.OK);
    }


}
