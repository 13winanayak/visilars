package com.ecom.controller;

import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.stereotype.Controller

public class AboutController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
