package com.omniops.omniops_backend.service.impl;

import com.omniops.omniops_backend.entity.RolePermission;
import com.omniops.omniops_backend.repository.RolePermissionRepository;
import com.omniops.omniops_backend.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements PermissionService {

    private final RolePermissionRepository rolePermissionRepository;

    @Override
    public List<String> getPermissionsByRole(Integer roleId) {

        return rolePermissionRepository.findByRole_RoleId(roleId)
                .stream()
                .filter(RolePermission::getIsAllowed)
                .map(rp -> rp.getPermission().getPermissionCode())
                .collect(Collectors.toList());

    }
}