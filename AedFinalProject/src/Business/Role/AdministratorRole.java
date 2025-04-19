/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

/**
 *
 * @author aaryakpawar
 */

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.Administrator.AdministratorWorkAreaPanelJPanel;
import javax.swing.JPanel;


public class AdministratorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        return new AdministratorWorkAreaPanelJPanel(userProcessContainer, enterprise, account,ecosystem);
    }

    
    
}
