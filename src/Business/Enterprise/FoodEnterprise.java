/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class FoodEnterprise extends Enterprise {
    public FoodEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Food);
    }

    
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
