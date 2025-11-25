package service;

import model.Doctor;
import java.util.ArrayList;

public class DoctorManager {

    private ArrayList<Doctor> doctors = new ArrayList<>();

    public void addDoctor(Doctor d) {
        doctors.add(d);
        System.out.println("Doctor added successfully!");
    }

    public void listDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors available.");
            return;
        }
        for (Doctor d : doctors) {
            System.out.println(d);
        }
    }

    public Doctor getDoctorById(int id) {
        for (Doctor d : doctors) {
            if (d.getDoctorId() == id) {
                return d;
            }
        }
        System.out.println("Doctor not found!");
        return null;
    }
}

