package com.employee.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Education;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeEducationRepository;
import com.employee.service.EmployeeEducationService;

@Service
public class EmployeeEducationServiceImpl implements EmployeeEducationService {

	@Autowired
    private EmployeeEducationRepository employeeEducationRepository;
	  
	@Override
	public Education getEducationByEmployeeId(Long id) {
		Optional<Object> education = Optional.of(employeeEducationRepository.getEducationByEmployeeId(id));
        if (education.isPresent()) {
            return (Education) education.get();
        }
		return null;
	}

	@Override
	public Education updateByEmployeeId(Long empId, Education education) {
	  Education educationDB = employeeEducationRepository.findByEmployeeId(empId);
    	System.out.println("->>>>>>"+education);
    	 if(educationDB != null) {
    		 if(education == null) {
    			 educationDB.setCollegeName(educationDB.getCollegeName()); 
    		 }
    		 //educationDB.setCollegeName(education.getCollegeName()); 
    		 educationDB.setDegree(education.getDegree());
    		 educationDB.setEmployeeId(education.getEmployeeId());
    		 educationDB.setGrade(education.getGrade());
    		 educationDB.setPassingYear(education.getPassingYear());
    		 return employeeEducationRepository.save(educationDB);
         }

        return education;
	}

	
   
}
