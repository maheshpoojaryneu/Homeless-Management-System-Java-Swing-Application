/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HMS.Enterprise;

import HMS.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class ClothingEnterprise extends Enterprise {
    public ClothingEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Clothing);
    }

    
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
