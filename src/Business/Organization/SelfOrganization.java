/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SelfRole;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class SelfOrganization extends Organization{

    public SelfOrganization() {
        super(Organization.Type.Self.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SelfRole());
        return roles;
    }
}
