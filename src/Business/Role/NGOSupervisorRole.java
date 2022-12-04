
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FoodClothing.ClothInventory;
import Business.FoodClothing.FoodInventory;
import Business.Homeless.HomelessDirectory;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.NGOSupervisorRole.NGOSupervisorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mahes
 */
public class NGOSupervisorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,HomelessDirectory homelessdirectory,FoodInventory foodinventory, ClothInventory clothinventory,String username) {
        return new NGOSupervisorWorkAreaJPanel(userProcessContainer, account, (NGOOrganization)organization, business, enterprise);
    }
    
}
