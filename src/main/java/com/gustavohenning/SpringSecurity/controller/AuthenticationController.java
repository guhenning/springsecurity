package com.gustavohenning.SpringSecurity.controller;

import com.gustavohenning.SpringSecurity.entity.ApplicationUser;
import com.gustavohenning.SpringSecurity.entity.dto.LoginResponseDTO;
import com.gustavohenning.SpringSecurity.entity.dto.RegistrationDTO;
import com.gustavohenning.SpringSecurity.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO body) {
        return authenticationService.registerUser(body.getUsername(), body.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body){
        return authenticationService.loginUser(body.getUsername(), body.getPassword());
    }
}
