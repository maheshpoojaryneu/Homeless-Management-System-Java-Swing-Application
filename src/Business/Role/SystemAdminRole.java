
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FoodClothing.ClothInventory;
import Business.FoodClothing.FoodInventory;
import Business.Homeless.HomelessDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mahes
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,HomelessDirectory homelessdirectory,FoodInventory foodinventory, ClothInventory clothinventory) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
