package com.example.introjpa.demo.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.Date;

@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer patientId;

    @Column(name = "patient_name")
    private String name;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "admitted_by")
    @ManyToMany(mappedBy = "employee_id")
    private Integer admittedBy;

    public Patient(Integer patientId, String name, Date dateOfBirth, Integer admittedBy) {
        setName(name);
        setDateOfBirth(dateOfBirth);
        setAdmittedBy(admittedBy);
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAdmittedBy() {
        return admittedBy;
    }

    public void setAdmittedBy(Integer admittedBy) {
        this.admittedBy = admittedBy;
    }
}
