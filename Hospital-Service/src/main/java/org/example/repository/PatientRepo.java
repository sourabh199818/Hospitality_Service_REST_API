package org.example.repository;

import org.example.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:9001", "http://localhost:9001/patients/add", "localhost:9001/patients/add"} )
@Repository

public class PatientRepo {



    public List<Patient> getAllPatients() {
        return patients;
    }

    public Patient getPatientById(Long id) {
        for (Patient patient : patients) {
            if (patient.getId().equals(id)) {
                return patient;
            }
        }
        return null;
    }

    public void updatePatient(Patient updatedPatient) {
        for (int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            if (patient.getId().equals(updatedPatient.getId())) {
                patients.set(i, updatedPatient);
                break;
            }
        }
    }


//     Below we have declared a Arraylist where we dont need Database it will create Entity based on ArrayList

    private List<Patient> patients = new ArrayList<Patient>();
//    public PatientRepo() {
//        // Add patients during initialization
//        String[] Names = { "Rahul", "Priya", "Amit", "Sneha", "Rajesh", "Neha", "Arun", "Anjali", "Sanjay", "Pooja", "Manish",
//                "Smita", "Vikram", "Rina", "Alok", "Shalini", "Kiran", "Meera", "Deepak", "Renu"
//        };

//        for (int i = 1; i <= 20; i++) {
//            Patient patient = new Patient();
//            patient.setId((long) i);
//            patient.setName(Names[i - 1]);
//            patient.setAge(30 + i);
//            patient.setRoom("Room " + i);
//            patient.setDoctorName("Doctor " + i);
//            patient.setAdmitTime(LocalDateTime.now());
//            patient.setExpenses(1000.0 + (i * 100));
//
//            if (i % 2 == 0) {
//                patient.setStatus("Admitted");
//            } else {
//                patient.setStatus("Discharge");
//            }
//
//            patients.add(patient);
////            System.out.println(patient);
//        }
//    }
//   private long nextId = 21;
//    public void addPatient(String name, int age, String room, String doctorName, double expenses, String status) {
//        Patient patient = new Patient();
//        patient.setId(generateUniqueId()); // Generate a unique ID for the patient
//        patient.setName(name);
//        patient.setAge(age);
//        patient.setRoom(room);
//        patient.setDoctorName(doctorName);
//        patient.setAdmitTime(LocalDateTime.now());
//        patient.setExpenses(expenses);
//        patient.setStatus(status);
//
//        patients.add(patient);
//    }
//    private Long generateUniqueId() {
//        return nextId++;
//    }







}
