package com.hr.service.impl;

import com.hr.entity.Role;
import com.hr.repository.RoleRepository;
import com.hr.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> fetchAllRoles() {
        List<Role> allRoles = roleRepository.findAll();
        return allRoles;
    }

    @Override
    public Role getRoleById(Long id) {
        Optional<Role> role = roleRepository.findById(id);
        if (role.isPresent()) {
            return role.get();
        }
        return null;
    }

    @Override
    public Role updateRoleById(Long id, Role role) {
        Optional<Role> role1 = roleRepository.findById(id);

        if(role1.isPresent()) {
        	System.out.println("->>>>>>");
			return roleRepository.save(role);
		}
        return role;
    }

    @Override
    public String deleteRoleById(Long id) {
        roleRepository.deleteById(id);
        return ""; //TODO
    }
}
