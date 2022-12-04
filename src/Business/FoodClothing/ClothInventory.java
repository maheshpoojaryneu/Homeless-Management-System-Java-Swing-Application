/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FoodClothing;

import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class ClothInventory {
    
    ArrayList<Cloth> clothinventory;   

    public ArrayList<Cloth> getClothinventory() {
        return clothinventory;
    }

    public void setClothinventory(ArrayList<Cloth> clothinventory) {
        this.clothinventory = clothinventory;
    }
    
     public Cloth addToInventory()
 {
     Cloth cloth= new Cloth();
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
    
}
