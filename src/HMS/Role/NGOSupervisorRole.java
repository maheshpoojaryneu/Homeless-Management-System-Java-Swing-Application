
package HMS.Role;

import HMS.NetworkDirectory;
import HMS.Enterprise.Enterprise;
import HMS.FoodClothing.ClothInventory;
import HMS.FoodClothing.FoodInventory;
import HMS.Homeless.HomelessDirectory;
import HMS.Organization.NGOOrganization;
import HMS.Organization.Organization;
import HMS.UserAccount.UserAccount;
import UI.NGOSupervisorRole.NGOSupervisorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mahes
 */
public class NGOSupervisorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, NetworkDirectory business,HomelessDirectory homelessdirectory,FoodInventory foodinventory, ClothInventory clothinventory,String username) {
        return new NGOSupervisorWorkAreaJPanel(userProcessContainer, account, (NGOOrganization)organization, business, enterprise);
    }
    
}
