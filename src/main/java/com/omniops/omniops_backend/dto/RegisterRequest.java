package com.omniops.omniops_backend.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;

    private String employeeCode;
    private String fullName;
    private String email;
    private String password;
    private String phone;
    private Integer roleId;

}