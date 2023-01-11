package com.apollo.service;

import com.apollo.entity.Patient;
import com.apollo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repository;

    public List<Patient> displayPatients(){
        return repository.findAll();
    }

    public Patient getPatientById(Long id){
        return repository.findById(id).get();
    }

    public void savePatient(Patient patient){
        repository.save(patient);
    }

    public void deletePatientById(Long id){
        repository.deleteById(id);
    }




}
