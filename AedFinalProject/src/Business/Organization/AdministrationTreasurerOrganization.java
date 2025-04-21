/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdministrationTreasurer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aaryakpawar
 */
public class AdministrationTreasurerOrganization extends Organization {

   public AdministrationTreasurerOrganization() {
        super(Organization.Type.AdministrationTreasurer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdministrationTreasurer());
        return roles;
    }
    
}
