package com.hr.controller;

import com.hr.entity.Department;
import com.hr.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:8080"})
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    
    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllCompanies() {
        return departmentService.fetchAllDepartments();
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id) {
        return departmentService.getDepartmentById(id);
    }

    @PutMapping("/department/{id}")
    public Department updateDepartment(@PathVariable("id") Long id, @RequestBody Department department) {
        return departmentService.updateDepartmentById(id, department);
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartment(@PathVariable("id") Long id) {
        return departmentService.deleteDepartmentById(id);
    }

}
