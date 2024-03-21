package com.example.introjpa.demo.repository;

import com.example.introjpa.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{
    Employee findByName(String name);

    List<Employee> findAllByName(String name);

}
