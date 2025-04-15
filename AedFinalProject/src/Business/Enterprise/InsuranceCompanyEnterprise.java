/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.InsurancePolicy.InsurancePolicyDirectory;
import Business.InsuredIndividual.InsuredIndividualDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hrishipal
 */
public class InsuranceCompanyEnterprise extends Enterprise {

    private InsuredIndividualDirectory insuranceCustomerList;
    private InsurancePolicyDirectory insurancePolicyList;

    public InsuranceCompanyEnterprise(String name) {
        super(Enterprise.EnterpriseType.InsuranceCompany, name);
        insuranceCustomerList = new InsuredIndividualDirectory();
        insurancePolicyList = new InsurancePolicyDirectory();

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.InsuranceAgent);
        orgTypes.add(Organization.Type.PolicyPlanner);
        orgTypes.add(Organization.Type.InsuranceFundOrganization);

        return orgTypes;
    }

    public InsuredIndividualDirectory getInsuranceCustomerList() {
        return insuranceCustomerList;
    }

    public void setInsuranceCustomerList(InsuredIndividualDirectory insuranceCustomerList) {
        this.insuranceCustomerList = insuranceCustomerList;
    }

    public InsurancePolicyDirectory getInsurancePolicyList() {
        return insurancePolicyList;
    }

    public void setInsurancePolicyList(InsurancePolicyDirectory insurancePolicyList) {
        this.insurancePolicyList = insurancePolicyList;
    }

}
