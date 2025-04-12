/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chandrashekarreddykusukunthla
 */
public class PatientDirectory {
        private List<Patient> patientList = new ArrayList<>();

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
}
