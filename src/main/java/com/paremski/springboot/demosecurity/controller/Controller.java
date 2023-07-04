package com.paremski.springboot.demosecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String homePage(){

        return "home";
    }
}
