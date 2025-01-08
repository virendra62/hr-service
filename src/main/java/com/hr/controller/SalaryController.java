package com.hr.controller;

import com.hr.entity.SalaryDetails;
import com.hr.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:8080"})
public class SalaryController {

    @Autowired
    private SalaryService salaryService;
    
    @PostMapping("/salary")
    public SalaryDetails saveSalary(@RequestBody SalaryDetails salaryDetails) {
        return salaryService.saveSalary(salaryDetails);
    }

    @GetMapping("/salaries")
    public List<SalaryDetails> getAllCompanies() {
        return salaryService.fetchAllSalaries();
    }

    @GetMapping("/salary/{id}")
    public SalaryDetails getSalaryById(@PathVariable("id") Long id) {
        return salaryService.getSalaryById(id);
    }

    @PutMapping("/salary/{id}")
    public SalaryDetails updateSalary(@PathVariable("id") Long id, @RequestBody SalaryDetails salaryDetails) {
        return salaryService.updateSalaryById(id, salaryDetails);
    }

    @DeleteMapping("/salary/{id}")
    public String deleteSalary(@PathVariable("id") Long id) {
        return salaryService.deleteSalaryById(id);
    }

}
