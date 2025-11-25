package service;

import model.Patient;
import java.util.ArrayList;

public class PatientManager {

    private ArrayList<Patient> patients = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
        System.out.println("Patient added successfully!");
    }

    public void listPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients available.");
            return;
        }
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    public Patient getPatientById(int id) {
        for (Patient p : patients) {
            if (p.getPatientId() == id) {
                return p;
            }
        }
        System.out.println("Patient not found!");
        return null;
    }
}

