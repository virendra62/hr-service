package com.hr.service;

import com.hr.entity.SalaryDetails;

import java.util.List;

public interface SalaryService {

    SalaryDetails saveSalary(SalaryDetails salaryDetails);

    List<SalaryDetails> fetchAllSalaries();

    SalaryDetails getSalaryById(Long id);

    SalaryDetails updateSalaryById(Long id, SalaryDetails salaryDetails);

    String deleteSalaryById(Long id);
}
