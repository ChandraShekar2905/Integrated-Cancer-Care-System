/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HealthCareOfficerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HealthcareOfficerRole.OfficerWorkAreaJPanel;
/**
 *
 * @author hrishipal
 */
public class AdministrationHealthOfficerRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new OfficerWorkAreaJPanel(userProcessContainer, userAccount, (HealthCareOfficerOrganization)organization, enterprise);
    }
}
