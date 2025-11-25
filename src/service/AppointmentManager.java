package service;

import model.Appointment;
import model.Patient;
import model.Doctor;

import java.util.ArrayList;

public class AppointmentManager {

    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void bookAppointment(int id, Patient p, Doctor d, String date, String slot) {

        if (p == null || d == null) {
            System.out.println("Invalid patient or doctor!");
            return;
        }

        for (Appointment a : appointments) {
            if (a.getDoctor().getDoctorId() == d.getDoctorId() &&
                a.getDate().equals(date) &&
                a.getTimeSlot().equals(slot)) {

                System.out.println("This time slot is already booked!");
                return;
            }
        }

        Appointment a = new Appointment(id, p, d, date, slot);
        appointments.add(a);
        System.out.println("Appointment booked successfully!");
    }

    public void listAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
            return;
        }
        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }

    public void cancelAppointment(int id) {
        for (Appointment a : appointments) {
            if (a.getAppointmentId() == id) {
                a.cancel();
                System.out.println("Appointment cancelled!");
                return;
            }
        }
        System.out.println("Appointment not found!");
    }
}
