package com.omniops.omniops_backend.repository;

import com.omniops.omniops_backend.entity.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RolePermissionRepository extends JpaRepository<RolePermission, Integer> {

   List<RolePermission> findByRole_RoleId(Integer roleId);

}