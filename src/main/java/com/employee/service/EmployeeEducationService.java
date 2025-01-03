package com.employee.service;

import com.employee.entity.Education;

public interface EmployeeEducationService {

    Education getEducationByEmployeeId(Long id);
    
    Education updateByEmployeeId(Long id, Education education);
}
