package org.example.repository;


import org.example.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientR extends JpaRepository<Patient, Long> {

}
