
package HMS.Role;

import HMS.NetworkDirectory;
import HMS.Enterprise.Enterprise;
import HMS.FoodClothing.ClothInventory;
import HMS.FoodClothing.FoodInventory;
import HMS.Homeless.HomelessDirectory;
import HMS.Organization.DoctorOrganization;
import HMS.Organization.Organization;
import HMS.Organization.PoliceOrganization;
import HMS.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author mahes
 */
public class DoctorRole extends Role{


     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, NetworkDirectory business,HomelessDirectory homelessdirectory,FoodInventory foodinventory, ClothInventory clothinventory,String username) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise, business);
    }
}
