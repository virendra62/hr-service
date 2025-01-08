package com.hr.service.impl;

import com.hr.entity.Department;
import com.hr.repository.DepartmentRepository;
import com.hr.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchAllDepartments() {
        List<Department> allDepartments = departmentRepository.findAll();
        return allDepartments;
    }

    @Override
    public Department getDepartmentById(Long id) {
        Optional<Department> department = departmentRepository.findById(id);
        if (department.isPresent()) {
            return department.get();
        }
        return null;
    }

    @Override
    public Department updateDepartmentById(Long id, Department department) {
        Optional<Department> department1 = departmentRepository.findById(id);

        if(department1.isPresent()) {
        	System.out.println("->>>>>>");
			return departmentRepository.save(department);
		}
        return department;
    }

    @Override
    public String deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
        return ""; //TODO
    }
}
