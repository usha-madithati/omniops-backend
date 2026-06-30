package com.omniops.omniops_backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "employee_code", unique = true)
    private String employeeCode;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "phone")
    private String phone;
@Column(name = "username", unique = true, nullable = false)
private String username;

@Column(name = "department")
private String department;

@Column(name = "designation")
private String designation;

@Column(name = "reporting_manager")
private String reportingManager;

@Column(name = "dashboard_redirect")
private String dashboardRedirect;
    @Column(name = "profile_photo")
    private String profilePhoto;

   
   @ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "role_id")
private Role role;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private LocalDateTime updatedAt;

    public enum Status {
        Active,
        Inactive,
        Blocked
    }
}