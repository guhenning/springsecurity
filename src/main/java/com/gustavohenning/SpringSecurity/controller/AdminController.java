package com.gustavohenning.SpringSecurity.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*") // TODO
public class AdminController {

    @GetMapping("/")
    public String adminControllerDemo() {
        return "Admin Demo Acess";
    }

}
