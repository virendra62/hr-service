package com.hr.service;

import com.hr.entity.Company;

import java.util.List;

public interface CompanyService {

    Company saveCompany(Company company);

    List<Company> fetchAllCompanies();

    Company getCompanyById(Long id);

    Company updateCompanyById(Long id, Company company);

    String deleteCompanyById(Long id);
}
