package com.employee.service.impl;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchAllEmployees() {
        List<Employee> allEmployees = employeeRepository.findAll();
        return allEmployees;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        }
        return null;
    }

    @Override
    public Employee updateEmployeeById(Long id, Employee employee) {
        Optional<Employee> employee1 = employeeRepository.findById(id);

        if(employee1.isPresent()) {
        	System.out.println("->>>>>>");
			return employeeRepository.save(employee);
		}
        return employee;
    }

	@Override
	public String deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
