/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdministrationSecretary;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aaryakpawar
 */
public class AdministrationSecretaryOrganization extends Organization {

    public AdministrationSecretaryOrganization() {
        super(Organization.Type.AdministrationSecretary.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdministrationSecretary());
        return roles;
    }
    
}
