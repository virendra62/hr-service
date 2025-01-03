package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.Education;

@Repository
public interface EmployeeEducationRepository extends JpaRepository<Education, Long> {

	Object getEducationByEmployeeId(Long id);
	
	//Education updateEducationByEmployeeId(Long employeeId, Education education);
	
	Education findByEmployeeId(Long employeeId);
	

}
