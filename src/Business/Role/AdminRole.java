
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Homeless.HomelessDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mahes
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,HomelessDirectory homelessdirectory) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    
    
}
