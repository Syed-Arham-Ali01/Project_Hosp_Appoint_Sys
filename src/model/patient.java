package model;

public class Patient {

    private int patientId;
    private String name;
    private int age;
    private String contactNumber;

    public Patient(int patientId, String name, int age, String contactNumber) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String toString() {
        return "Patient ID: " + patientId +
                ", Name: " + name +
                ", Age: " + age +
                ", Contact: " + contactNumber;
    }
}

