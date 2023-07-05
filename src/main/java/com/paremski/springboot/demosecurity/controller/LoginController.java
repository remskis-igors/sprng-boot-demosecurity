package com.paremski.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {


    @GetMapping("showMyLoginPge")
    public String showMyLoginPage() {

        return "fancy-login";
    }
}
