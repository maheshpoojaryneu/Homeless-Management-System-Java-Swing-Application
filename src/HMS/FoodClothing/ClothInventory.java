/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HMS.FoodClothing;

import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class ClothInventory {
    
    private ArrayList<Cloth> clothinventory;   
    private int total;
   
   public ClothInventory()
   {
       clothinventory=new ArrayList();
   }
    public ArrayList<Cloth> getClothinventory() {
        return clothinventory;
    }

     public Cloth addToInventory(String shelter, String location,int quantity,String providedby,String donatedon)
 {
     Cloth cloth= new Cloth();
     cloth.setShelter(shelter);
     cloth.setDonatedon(donatedon);
     cloth.setLocation(location);
     cloth.setProvidedby(providedby);
     cloth.setQuantity(quantity);
     clothinventory.add(cloth);
     return cloth;
 }
 public Cloth removeFromInventory(Cloth cloth)
 {
     clothinventory.remove(cloth);
     return cloth;
 }
 public Cloth updateInventory(int index, Cloth cloth)
 {
     clothinventory.set(index,cloth);
     return cloth;
 }
 
 public int clothtotal()
 {
     for(Cloth c : getClothinventory())
     {
         total = total +c.getQuantity();
     }
     return total;
 }
    
}
