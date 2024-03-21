package com.example.introjpa.demo.service;

import com.example.introjpa.demo.model.Patient;
import com.example.introjpa.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatient(){
        return patientRepository.findAll();
    }

    public Object addNewPatient(Patient patient){
        return patientRepository.save(patient);
    }
}
