package com.jamesvrooney.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greeting")
public class HelloController {

    @GetMapping("hello")
    public String getHello() {
        return "GET::Hello buddy";
    }

    @PostMapping("hello")
    public String postHello() {
        return "POST::Hello buddy";
    }
}
