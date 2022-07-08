/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author archil
 */
public class Supplier {

    private String supplyName;
    private PatientCatalog patientCatalog;

    public Supplier() {
        patientCatalog = new PatientCatalog();
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public PatientCatalog getPatientCatalog() {
        return patientCatalog;
    }

    public void setPatientCatalog(PatientCatalog patientCatalog) {
        this.patientCatalog = patientCatalog;
    }

    @Override
    public String toString() {
        return supplyName; 
    }

}
