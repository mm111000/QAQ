package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPage {
    @GetMapping(value = "/student")
    public  String showpage() {
        return "redirect:student1";
    }

    @GetMapping(value = "/student1")
    public  String show1(){
        return "/fore";
    }
}
