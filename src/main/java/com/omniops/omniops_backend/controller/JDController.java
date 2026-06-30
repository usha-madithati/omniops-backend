package com.omniops.omniops_backend.controller;

import com.omniops.omniops_backend.dto.JDRequest;
import com.omniops.omniops_backend.dto.JDResponse;
import com.omniops.omniops_backend.service.JDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jd")
@CrossOrigin(origins = "*")
public class JDController {

    @Autowired
    private JDService jdService;

    @PostMapping("/fetch")
    public JDResponse fetchJob(@RequestBody JDRequest request) {

        return jdService.fetchJobDetails(request.getUrl());

    }
}