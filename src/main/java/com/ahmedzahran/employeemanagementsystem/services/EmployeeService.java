package com.ahmedzahran.employeemanagementsystem.services;

import com.ahmedzahran.employeemanagementsystem.entity.EmployeeEntity;
import com.ahmedzahran.employeemanagementsystem.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
    boolean deleteEmployee(Long id);


    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
