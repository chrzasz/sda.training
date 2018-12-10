package sda.training.linkedListHash;

import java.util.Optional;

public interface PatientRegistry {
    void add(Patient patient);
    Optional<Patient> getPatientByPesel(String pesel);
    int getPatientsCount();
}
