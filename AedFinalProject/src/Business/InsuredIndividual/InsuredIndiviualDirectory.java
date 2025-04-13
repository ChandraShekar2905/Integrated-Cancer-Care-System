/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.InsuredIndividual;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hrishipal
 */
public class InsuredIndiviualDirectory {
      private List<InsuredIndividual> insuranceHolders = new ArrayList<>();

    public List<InsuredIndividual> getInsuranceHolders() {
        return insuranceHolders;
    }

    public void setInsuranceHolders(List<InsuredIndividual> insuranceHolders) {
        this.insuranceHolders = insuranceHolders;
    }

    @Override
    public String toString() {
        return "InsuranceCustomerDirectory{" + "insuranceCustomers=" + insuranceHolders + '}';
    }
    

}
