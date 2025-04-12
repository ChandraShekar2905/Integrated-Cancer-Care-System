/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.InsuredIndividual;

/**
 *
 * @author hrishipal
 */
public class InsuredIndividual {
    
    private String policyName;
    private String InsuranceCompanyName;
    private double coveragepercentage;
    private String policyTC;
    private double monthlyInstallment;

    public InsuredIndividual(String policyName, String InsuranceCompany, double coverage) {
        this.policyName = policyName;
        this.InsuranceCompanyName = InsuranceCompany;
        this.coveragepercentage = coverage;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyType) {
        this.policyName = policyType;
    }

    public double getMonthlyInstallment() {
        return monthlyInstallment;
    }

    public void setMonthlyInstallment(double monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }

    public String getInsuranceCompanyName() {
        return InsuranceCompanyName;
    }

    public void setInsuranceCompanyName(String InsuranceCompanyName) {
        this.InsuranceCompanyName = InsuranceCompanyName;
    }

    public double getCoveragepercentage() {
        return coveragepercentage;
    }

    public void setCoveragepercentage(double coveragepercentage) {
        this.coveragepercentage = coveragepercentage;
    }

    public String getPolicyTC() {
        return policyTC;
    }

    public void setPolicyTC(String policyTC) {
        this.policyTC = policyTC;
    }

    @Override
    public String toString() {
        return policyName;
    }

           
}
