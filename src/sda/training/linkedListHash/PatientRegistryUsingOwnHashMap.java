package sda.training.linkedListHash;

import sda.training.linkedListHash.Patient;
import sda.training.linkedListHash.PatientRegistry;

import java.util.Map;
import java.util.Optional;

public class PatientRegistryUsingOwnHashMap implements PatientRegistry {
    private Map<String, Patient> patients = new OurOwnHashMap();

    public void add(Patient patient) {
        patients.put(patient.Pesel, patient);
    }

    public synchronized Optional<Patient> getPatientByPesel(String pesel) {
        if(patients.containsKey(pesel)) {
            return Optional.of(patients.get(pesel));
        } else {
            return Optional.empty();
        }
    }

    public int getPatientsCount() {
        return patients.size();
    }
}
