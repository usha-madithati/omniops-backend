package com.omniops.omniops_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class LoginResponse {

    private boolean success;

    private String message;

    private String token;

    private Integer userId;

    private String fullName;

    private String email;

    private String role;

    private List<String> permissions;

}