
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FoodClothing.ClothInventory;
import Business.FoodClothing.FoodInventory;
import Business.Homeless.HomelessDirectory;
import Business.Organization.PoliceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PoliceRole.PoliceViewRecordJPanel;

/**
 *
 * @author mahes
 */
public class PoliceRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,HomelessDirectory homelessdirectory,FoodInventory foodinventory, ClothInventory clothinventory) {
        return new PoliceViewRecordJPanel(userProcessContainer, account, (PoliceOrganization)organization, enterprise,homelessdirectory);
    }
    
    
}
