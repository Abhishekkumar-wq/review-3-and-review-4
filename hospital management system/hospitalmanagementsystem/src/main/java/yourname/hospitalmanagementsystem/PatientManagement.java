package yourname.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class PatientManagement {
    private List<Patient> patientList = new ArrayList<>();

    public void addPatient(Patient patient) {
        patientList.add(patient);
    }

    public void updatePatient(int index, Patient updatedPatient) {
        if (index >= 0 && index < patientList.size()) {
            patientList.set(index, updatedPatient);
        } else {
            System.err.println("Invalid patient index.");
        }
    }

    public void deletePatient(int index) {
        if (index >= 0 && index < patientList.size()) {
            patientList.remove(index);
        } else {
            System.err.println("Invalid patient index.");
        }
    }

    public List<Patient> getAllPatients() {
        return patientList;
    }
}
