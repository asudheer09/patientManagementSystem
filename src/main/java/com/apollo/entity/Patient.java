package com.apollo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    private Long patientId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String city;
    private String disease;
}
