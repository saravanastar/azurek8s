package com.azure.spring.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeclomeController {
    @GetMapping("/")
    public String get() {
        return "Application is up and running";
    }
}
