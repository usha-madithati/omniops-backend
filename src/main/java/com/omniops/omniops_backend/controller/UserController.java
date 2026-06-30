package com.omniops.omniops_backend.controller;

import com.omniops.omniops_backend.dto.RegisterRequest;
import com.omniops.omniops_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String createUser(@RequestBody RegisterRequest request){

        return userService.register(request);

    }

}