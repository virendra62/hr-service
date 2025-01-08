package com.hr.controller;

import com.hr.entity.Company;
import com.hr.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:8080"})
public class CompanyController {

    @Autowired
    private CompanyService companyService;
    
    @PostMapping("/company")
    public Company saveCompany(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }

    @GetMapping("/companies")
    public List<Company> getAllCompanies() {
        return companyService.fetchAllCompanies();
    }

    @GetMapping("/company/{id}")
    public Company getCompanyById(@PathVariable("id") Long id) {
        return companyService.getCompanyById(id);
    }

    @PutMapping("/company/{id}")
    public Company updateCompany(@PathVariable("id") Long id, @RequestBody Company company) {
        return companyService.updateCompanyById(id, company);
    }

    @DeleteMapping("/company/{id}")
    public String deleteCompany(@PathVariable("id") Long id) {
        return companyService.deleteCompanyById(id);
    }

}
