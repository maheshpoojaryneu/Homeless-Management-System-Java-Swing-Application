/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HMS.Role;

import HMS.NetworkDirectory;
import HMS.Enterprise.Enterprise;
import HMS.FoodClothing.ClothInventory;
import HMS.FoodClothing.FoodInventory;
import HMS.Homeless.HomelessDirectory;
import HMS.Organization.ClothingOrganization;
import HMS.Organization.Organization;
import HMS.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.ClothingRole.ClothingWorkAreaJPanel;
/**
 *
 * @author mahes
 */
public class ClothingRole extends Role{


     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, NetworkDirectory business,HomelessDirectory homelessdirectory,FoodInventory foodinventory, ClothInventory clothinventory,String username) {
        return new ClothingWorkAreaJPanel(userProcessContainer, account,organization, enterprise, business,clothinventory, username);
    }
    
}
