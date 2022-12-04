/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FoodClothing.ClothInventory;
import Business.FoodClothing.FoodInventory;
import Business.Homeless.HomelessDirectory;
import Business.Organization.Organization;
import Business.Organization.SelfOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.volunteer.SelfWorkAreaJPanel;

/**
 *
 * @author mahes
 */
public class SelfRole extends Role{


     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,HomelessDirectory homelessdirectory, FoodInventory foodinventory, ClothInventory clothinventory,String username ) {
        return new SelfWorkAreaJPanel(userProcessContainer, account, (SelfOrganization)organization, enterprise, business, foodinventory, clothinventory, username);
    }
}
