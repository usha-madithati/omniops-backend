package com.omniops.omniops_backend.service;

import java.util.List;

public interface PermissionService {

    List<String> getPermissionsByRole(Integer roleId);

}