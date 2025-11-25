import model.Patient;
import model.Doctor;
import model.Appointment;
import service.PatientManager;
import service.DoctorManager;
import service.AppointmentManager;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientManager patientManager = new PatientManager();
        DoctorManager doctorManager = new DoctorManager();
        AppointmentManager appointmentManager = new AppointmentManager();

        int choice;

        System.out.println("=======================================");
        System.out.println("   HOSPITAL APPOINTMENT BOOKING SYSTEM ");
        System.out.println("=======================================");

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Add Patient");
            System.out.println("2. List Patients");
            System.out.println("3. Add Doctor");
            System.out.println("4. List Doctors");
            System.out.println("5. Book Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Cancel Appointment");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String pname = sc.nextLine();
                    System.out.print("Enter Patient Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Patient Contact: ");
                    String contact = sc.nextLine();

                    Patient p = new Patient(pid, pname, age, contact);
                    patientManager.addPatient(p);
                    break;

                case 2:
                    patientManager.listPatients();
                    break;

                case 3:
                    System.out.print("Enter Doctor ID: ");
                    int did = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String dname = sc.nextLine();
                    System.out.print("Enter Specialization: ");
                    String spec = sc.nextLine();

                    Doctor d = new Doctor(did, dname, spec);
                    doctorManager.addDoctor(d);
                    break;

                case 4:
                    doctorManager.listDoctors();
                    break;

                case 5:
                    System.out.print("Enter Appointment ID: ");
                    int aid = sc.nextInt();

                    System.out.print("Enter Patient ID: ");
                    int pID = sc.nextInt();
                    Patient pat = patientManager.getPatientById(pID);

                    System.out.print("Enter Doctor ID: ");
                    int dID = sc.nextInt();
                    Doctor doc = doctorManager.getDoctorById(dID);

                    sc.nextLine();
                    System.out.print("Enter Date (DD-MM-YYYY): ");
                    String date = sc.nextLine();
                    System.out.print("Enter Time Slot (e.g., 10:00AM): ");
                    String slot = sc.nextLine();

                    appointmentManager.bookAppointment(aid, pat, doc, date, slot);
                    break;

                case 6:
                    appointmentManager.listAppointments();
                    break;

                case 7:
                    System.out.print("Enter Appointment ID to cancel: ");
                    int cancelID = sc.nextInt();
                    appointmentManager.cancelAppointment(cancelID);
                    break;

                case 8:
                    System.out.println("Exiting system... Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

