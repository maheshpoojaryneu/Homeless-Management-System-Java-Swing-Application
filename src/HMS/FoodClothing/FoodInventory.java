/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HMS.FoodClothing;

import HMS.Homeless.Shelter;
import java.util.ArrayList;

/**
 *
 * @author mahes
 */
public class FoodInventory {
 private ArrayList<Food> foodinventory;   

  public FoodInventory()
 {
     foodinventory=new ArrayList();
 }
    public ArrayList<Food> getFoodinventory() {
        return foodinventory;
    }
 public Food addToInventory(String shelter, String location,int quantity,String providedby,String donatedon)
 {
     Food food= new Food();
     food.setShelter(shelter);
     food.setDonatedon(donatedon);
     food.setLocation(location);
     food.setProvidedby(providedby);
     food.setQuantity(quantity);
     foodinventory.add(food);
     return food;
 }
 public Food removeFromInventory(Food food)
 {
     foodinventory.remove(food);
     return food;
     
 }
 public Food updateInventory(int index, Food food)
 {
     foodinventory.set(index,food);
     return food;
 }

}
