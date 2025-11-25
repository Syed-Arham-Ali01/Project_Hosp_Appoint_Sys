package model;

public class Appointment {

    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String timeSlot;
    private String status;

    public Appointment(int appointmentId, Patient patient, Doctor doctor, String date, String timeSlot) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.timeSlot = timeSlot;
        this.status = "Booked";
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void cancel() {
        status = "Cancelled";
    }

    public String toString() {
        return "Appointment ID: " + appointmentId +
                ", Patient: " + patient.getName() +
                ", Doctor: " + doctor.getName() +
                ", Date: " + date +
                ", Time: " + timeSlot +
                ", Status: " + status;
    }
}

