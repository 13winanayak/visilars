package com.ecom.controller;

import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.stereotype.Controller

public class ContactController {


    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
