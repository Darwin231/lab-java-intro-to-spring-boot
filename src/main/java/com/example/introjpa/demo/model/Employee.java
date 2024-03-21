package com.example.introjpa.demo.model;

import jakarta.persistence.*;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToMany(mappedBy = "admitted_by")
    private Integer employeeId;

    @Column(name = "department")
    private String department;

    @Column(name = "employee_name")
    private String Name;

    @Column(name = "status")
    private status status;

    public Employee(Integer employeeId, String department, String name, com.example.introjpa.demo.model.status status) {
        setDepartment(department);
        setName(name);
        setStatus(status);
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployee_id(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public com.example.introjpa.demo.model.status getStatus() {
        return status;
    }

    public void setStatus(com.example.introjpa.demo.model.status status) {
        this.status = status;
    }
}
