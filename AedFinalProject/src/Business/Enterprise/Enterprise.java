/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.List;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;


/**
 *
 * @author hrishipal
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
     private String type; // Discriminator field for Gson
     
 
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    //Created EnterpriseTpe
    public enum EnterpriseType {

        HealthcareCenter("HealthcareCenter"),
        InsuranceCompany("InsuranceCompany"),
        GovernmentAid("GovernmentAid"),
        Pharmacy("Pharmacy");
        

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
        

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(EnterpriseType type, String name) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        this.type = this.getClass().getSimpleName(); // Automatically set type to the subclass name

    }

    public String getType() {
        return type;
    }
    
    public abstract List<Organization.Type> getOrganizationTypes();

}
