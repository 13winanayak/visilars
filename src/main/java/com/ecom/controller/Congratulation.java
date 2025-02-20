package com.ecom.controller;


import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.stereotype.Controller
public class Congratulation {


    @GetMapping("/save-order")
    public String Congratulation() {
        return "Congratulation";
    }
}
