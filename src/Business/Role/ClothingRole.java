/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Homeless.HomelessDirectory;
import Business.Organization.ClothingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ClothingRole.ClothingWorkAreaJPanel;
/**
 *
 * @author mahes
 */
public class ClothingRole extends Role{


     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,HomelessDirectory homelessdirectory) {
        return new ClothingWorkAreaJPanel(userProcessContainer, account, (ClothingOrganization)organization, enterprise, business);
    }
    
}
