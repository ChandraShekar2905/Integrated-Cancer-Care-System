/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
/**
 *
 * @author aaryakpawar
 */

import Business.Organization.Organization.Type;
import java.util.ArrayList;
import java.util.List;


public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }
    public ArrayList<Organization> getOrganizations() {
        return organizationList;
    }
    
    public void addOrganization(Organization organization) {
        organizationList.add(organization);
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        //Adding HealthCenter Organizations
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
        
         else if(type.getValue().equals(Type.Patient.getValue()))
        {
            organization = new PatientOrganization();
            organizationList.add(organization);
                    
        }
        
        else if(type.getValue().equals(Type.Receptionist.getValue()))
        {
            organization = new ReceptionistOrganization();
            organizationList.add(organization);
                    
        }
         else if(type.getValue().equals(Type.Pharmacy.getValue()))
        {
            organization = new PharmacyOrganization();
            organizationList.add(organization);
                    
        }
        
        
        //Adding Administration Organizations
        
        else if(type.getValue().equals(Type.HealthcareChief.getValue()))
        {
            organization = new HealthCareOfficerOrganization();
            organizationList.add(organization);
                    
        }
        
         else if(type.getValue().equals(Type.AdministrationSecretary.getValue()))
        {
            organization = new AdministrationSecretaryOrganization();
            organizationList.add(organization);
                    
        }
         else if(type.getValue().equals(Type.AdministrationTreasurer.getValue()))
        {
            organization = new AdministrationTreasurerOrganization();
            organizationList.add(organization);
                    
        }
                //Adding Insurance Organizations
                
          else if(type.getValue().equals(Type.InsuranceOfficer.getValue()))
        {
            organization = new InsuranceOfficerOrganization();
            organizationList.add(organization);
                    
        } 
          else if(type.getValue().equals(Type.InsuranceFundOrganization.getValue()))
        {
            organization = new InsuranceFinanceOrganization();
            organizationList.add(organization);
                    
        }
          else if(type.getValue().equals(Type.PolicyPlanner.getValue()))
        {
            organization = new InsurancePolicyPlannerOrganization();
            organizationList.add(organization);
                    
        }
       
        return organization;
    }
}