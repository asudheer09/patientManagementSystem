package com.apollo.controller;

import com.apollo.entity.Patient;
import com.apollo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apollo/v1")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("all")
    public List<Patient> displayAllPatients(){
        return patientService.displayPatients();
    }


    @GetMapping("patient")
    public Patient getPatientById(){
        return patientService.getPatientById(1L);
    }

}

//http://localhost:8080/all
//http://localhost:8080/apollo/v1/all