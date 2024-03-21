package com.example.introjpa.demo.repository;

import com.example.introjpa.demo.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository {
    Patient findByName(String name);

    List<Patient> findAllByName(String name);
}
