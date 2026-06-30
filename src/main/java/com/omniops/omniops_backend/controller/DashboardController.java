package com.omniops.omniops_backend.controller;

import com.omniops.omniops_backend.repository.UserRepository;
import com.omniops.omniops_backend.repository.RoleRepository;
import com.omniops.omniops_backend.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin("*")
public class DashboardController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    @GetMapping("/stats")
    public Map<String,Object> getStats(){

        Map<String,Object> data = new HashMap<>();

        data.put("users",userRepository.count());
        data.put("roles",roleRepository.count());
        data.put("permissions",permissionRepository.count());

        return data;
    }

}