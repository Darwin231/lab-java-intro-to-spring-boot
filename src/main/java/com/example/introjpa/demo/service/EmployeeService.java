package com.example.introjpa.demo.service;

import com.example.introjpa.demo.model.Employee;
import com.example.introjpa.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee addNewEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
