package com.hr.service.impl;

import com.hr.entity.SalaryDetails;
import com.hr.repository.SalaryRepository;
import com.hr.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryRepository salaryRepository;

    @Override
    public SalaryDetails saveSalary(SalaryDetails salary) {
        return salaryRepository.save(salary);
    }

    @Override
    public List<SalaryDetails> fetchAllSalaries() {
        List<SalaryDetails> allSalaries = salaryRepository.findAll();
        return allSalaries;
    }

    @Override
    public SalaryDetails getSalaryById(Long id) {
        Optional<SalaryDetails> salary = salaryRepository.findById(id);
        if (salary.isPresent()) {
            return salary.get();
        }
        return null;
    }

    @Override
    public SalaryDetails updateSalaryById(Long id, SalaryDetails salary) {
        Optional<SalaryDetails> salary1 = salaryRepository.findById(id);

        if(salary1.isPresent()) {
        	System.out.println("->>>>>>");
			return salaryRepository.save(salary);
		}
        return salary;
    }

    @Override
    public String deleteSalaryById(Long id) {
        salaryRepository.deleteById(id);
        return ""; //TODO
    }
}
