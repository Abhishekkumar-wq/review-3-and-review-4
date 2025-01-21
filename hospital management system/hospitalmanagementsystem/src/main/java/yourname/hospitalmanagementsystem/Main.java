package yourname.hospitalmanagementsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PatientManagement patientManagement = new PatientManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Patient");
            System.out.println("2. Update Patient");
            System.out.println("3. Delete Patient");
            System.out.println("4. View All Patients");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter patient ailment: ");
                    String ailment = scanner.nextLine();
                    patientManagement.addPatient(new Patient(name, age, ailment));
                    break;
                case 2:
                    System.out.print("Enter patient index: ");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter new ailment: ");
                    String newAilment = scanner.nextLine();
                    patientManagement.updatePatient(indexToUpdate, new Patient(newName, newAge, newAilment));
                    break;
                case 3:
                    System.out.print("Enter patient index: ");
                    int indexToDelete = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    patientManagement.deletePatient(indexToDelete);
                    break;
                case 4:
                    for (Patient patient : patientManagement.getAllPatients()) {
                        System.out.println(patient);
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Invalid option. Please try again.");
            }
        }
    }
}
