package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Education;
import com.employee.entity.Employee;
import com.employee.entity.Login;
import com.employee.service.EmployeeEducationService;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:8080"})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    
    @PostMapping("employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
    @PostMapping("/login")
    public String login(@RequestBody Login employee) {
        return "token";
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.fetchAllEmployees();
    }

    @GetMapping("/personal-info/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/personal-info/{id}")
    public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
    	System.out.println("=====>>>>");
        return employeeService.updateEmployeeById(id, employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") Long id) {
        return employeeService.deleteEmployeeById(id);
    }

}
