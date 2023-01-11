package com.apollo.controller;

import com.apollo.entity.Patient;
import com.apollo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apollo/v1")
public class PatientController {
    @Autowired
    private PatientService patientService;

    //@GetMapping("all")
    @RequestMapping(method = RequestMethod.GET,value = "all")
    public List<Patient> displayAllPatients(){

        return patientService.displayPatients();
    }


    @PostMapping("create")
    public String createPatient(@RequestBody Patient patient){
        patientService.savePatient(patient);
        return "saved successfully";
    }

    //@DeleteMapping("delete/{id}")
    @RequestMapping(method = RequestMethod.DELETE,value="delete/{id}")
    public String deletePatient(@PathVariable Long id){
        patientService.deletePatientById(id);
        return "deleted successfully";
    }

    @GetMapping("get/{id}")
    public Patient getPatientById(@PathVariable Long id){
        return patientService.getPatientById(id);
    }

    @GetMapping("patient")
    public Patient getPatientById(){
        return patientService.getPatientById(1L);
    }

}

//http://localhost:8080/all
//http://localhost:8080/apollo/v1/all