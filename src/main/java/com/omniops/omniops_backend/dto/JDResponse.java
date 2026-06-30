package com.omniops.omniops_backend.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JDResponse {

    private String company;

    private String role;

    private String location;

    private String experience;

    private String employmentType;

    private List<String> skills;

    private String description;

}