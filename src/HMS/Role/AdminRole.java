
package HMS.Role;

import HMS.NetworkDirectory;
import HMS.Enterprise.Enterprise;
import HMS.FoodClothing.ClothInventory;
import HMS.FoodClothing.FoodInventory;
import HMS.Homeless.HomelessDirectory;
import HMS.Organization.Organization;
import HMS.UserAccount.UserAccount;
import UI.AdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mahes
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, NetworkDirectory business,HomelessDirectory homelessdirectory,FoodInventory foodinventory, ClothInventory clothinventory,String username) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    
    
}
