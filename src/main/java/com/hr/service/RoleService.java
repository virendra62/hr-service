package com.hr.service;

import com.hr.entity.Role;

import java.util.List;

public interface RoleService {

    Role saveRole(Role role);

    List<Role> fetchAllRoles();

    Role getRoleById(Long id);

    Role updateRoleById(Long id, Role role);

    String deleteRoleById(Long id);
}
