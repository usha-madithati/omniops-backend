package com.omniops.omniops_backend.repository;

import com.omniops.omniops_backend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer>{

    Optional<Role> findByRoleName(String roleName);

}