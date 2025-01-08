package com.hr.service.impl;

import com.hr.entity.Company;
import com.hr.repository.CompanyRepository;
import com.hr.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public List<Company> fetchAllCompanies() {
        List<Company> allCompanys = companyRepository.findAll();
        return allCompanys;
    }

    @Override
    public Company getCompanyById(Long id) {
        Optional<Company> company = companyRepository.findById(id);
        if (company.isPresent()) {
            return company.get();
        }
        return null;
    }

    @Override
    public Company updateCompanyById(Long id, Company company) {
        Optional<Company> company1 = companyRepository.findById(id);

        if(company1.isPresent()) {
        	System.out.println("->>>>>>");
			return companyRepository.save(company);
		}
        return company;
    }

	@Override
	public String deleteCompanyById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
