package com.omniops.omniops_backend.controller;

import com.omniops.omniops_backend.dto.LoginRequest;
import com.omniops.omniops_backend.dto.LoginResponse;
import com.omniops.omniops_backend.dto.RegisterRequest;
import com.omniops.omniops_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return userService.login(request);
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {
        return userService.register(request);
    }
}