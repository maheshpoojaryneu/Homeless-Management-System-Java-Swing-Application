/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HMS.Organization;

import HMS.Role.FoodRole;
import HMS.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class FoodOrganization extends Organization{

    public FoodOrganization() {
        super(Organization.Type.Restaurant.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodRole());
        return roles;
    }
}
