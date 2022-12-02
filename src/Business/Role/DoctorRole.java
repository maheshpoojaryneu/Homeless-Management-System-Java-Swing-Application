
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Homeless.HomelessDirectory;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PoliceOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author mahes
 */
public class DoctorRole extends Role{


     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,HomelessDirectory homelessdirectory) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise, business);
    }
}
