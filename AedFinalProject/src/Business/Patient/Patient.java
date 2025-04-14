/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Patient;

import Business.InsuredIndividual.InsuredIndividual;

/**
 *
 * @author hrishipal
 */
public class Patient {
    private String firstName;
    private String lastName;
    
    private String id;
    private String ssn;
    private String age;
    private String contactNumber;
    private String address;
    private String gender;
    private boolean isTreatmentComplete;
    private String appointmentDate;
    private String email;
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private InsuredIndividual insuranceCustomer;

    public Patient() {

    }

    public String getLastName() {
        return lastName;
    }

   
    
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public InsuredIndividual getInsuranceCustomer() {
        return insuranceCustomer;
    }

    public void setInsuranceCustomer(InsuredIndividual insuranceCustomer) {
        this.insuranceCustomer = insuranceCustomer;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSsn() {
        return ssn;
    }

    

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIsTreatmentComplete() {
        return isTreatmentComplete;
    }

    public void setIsTreatmentComplete(boolean isTreatmentComplete) {
        this.isTreatmentComplete = isTreatmentComplete;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    
     public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;

    }
}
