package com.example.springbootangular.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("/")
    public String getWelcome(){
        return "Hello World!";
    }
}
