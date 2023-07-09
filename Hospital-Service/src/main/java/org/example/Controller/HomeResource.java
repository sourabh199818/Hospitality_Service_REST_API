package org.example.Controller;

import org.example.model.Patient;
import org.example.repository.PatientRepo;
import org.example.repository.PatientR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = {"http://localhost:9001", "http://localhost:9001/patients/add", "localhost:9001/patients/add"} )
public class HomeResource {

    private final PatientRepo patientRepo;

    @Autowired
    private final PatientR patientR;

    @Autowired
    public HomeResource(PatientRepo patientRepo, PatientR patientRepo1, PatientR patientR) {
        this.patientRepo = patientRepo;
        this.patientR = patientR;

    }



    @GetMapping("/patients")
    public String getAllPatients(Model model) {
        List<Patient> patients = patientRepo.getAllPatients();
        model.addAttribute("patients", patients);
        return "index";
    }

    @PostMapping("/patients/add")
    public String addPatient(@RequestBody Patient patient) {
        return  patientR.save(patient);

    }


//   Below  are the code for someone who is using List instead of Database

//    @PostMapping("/patients/add")
//    public String addPatient(@RequestParam("name") String name,
//                             @RequestParam("age") int age,
//                             @RequestParam("room") String room,
//                             @RequestParam("doctorName") String doctorName,
//                             @RequestParam("expenses") double expenses,
//                             @RequestParam("status") String status) {
//        patientRepo.addPatient(name, age, room, doctorName, expenses, status);
//        return "redirect:/patients";
//    }


}
