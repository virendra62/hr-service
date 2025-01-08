package com.hr.service;

import com.hr.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchAllDepartments();

    Department getDepartmentById(Long id);

    Department updateDepartmentById(Long id, Department department);

    String deleteDepartmentById(Long id);
}
