/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anu61
 */
public class PatientCatalog {
    
     private List<Patient> patientCatalog;

    public PatientCatalog() {
        patientCatalog = new ArrayList<Patient>();
    }

    public List<Patient> getPatientcatalog() {
        return patientCatalog;
    }

    public Patient addPatient() {
        Patient p = new Patient();
        patientCatalog.add(p);
        return p;
    }

    public void removePatient(Patient p) {
        patientCatalog.remove(p);
    }

    
}
