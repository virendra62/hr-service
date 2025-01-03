package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Education;
import com.employee.service.EmployeeEducationService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:8080"})
public class EducationController {

    @Autowired
    EmployeeEducationService employeeEducationService;
    
    @GetMapping("/education/{id}")
    public Education getEmployeeEducationById(@PathVariable("id") Long empId) {
        return employeeEducationService.getEducationByEmployeeId(empId);
    }

    @PutMapping("/education/{id}")
    public Education updateEducation(@PathVariable("id") Long id, @RequestBody Education education) {
    	System.out.println("=====>>>>");
        return employeeEducationService.updateByEmployeeId(id, education);
    }
      
}
