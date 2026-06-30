package com.omniops.omniops_backend.repository;

import com.omniops.omniops_backend.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {

    Optional<Permission> findByPermissionCode(String permissionCode);

}