package com.hr.controller;

import com.hr.entity.Role;
import com.hr.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:8080"})
public class RoleController {

    @Autowired
    private RoleService roleService;
    
    @PostMapping("/role")
    public Role saveRole(@RequestBody Role role) {
        return roleService.saveRole(role);
    }

    @GetMapping("/roles")
    public List<Role> getAllCompanies() {
        return roleService.fetchAllRoles();
    }

    @GetMapping("/role/{id}")
    public Role getRoleById(@PathVariable("id") Long id) {
        return roleService.getRoleById(id);
    }

    @PutMapping("/role/{id}")
    public Role updateRole(@PathVariable("id") Long id, @RequestBody Role role) {
        return roleService.updateRoleById(id, role);
    }

    @DeleteMapping("/role/{id}")
    public String deleteRole(@PathVariable("id") Long id) {
        return roleService.deleteRoleById(id);
    }

}
