/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HMS.FoodClothing;

import HMS.Homeless.Shelter;
import HMS.WorkQueue.WorkQueue;

/**
 *
 * @author mahes
 */
public class Food {
    
 private String shelter;
 private String location;
 private int quantity;
 private String providedby;
 private String donatedon;
 private WorkQueue workQueue;
private int TotalCost;
 public Food()
 {
     workQueue = new WorkQueue();

 }
    public String getShelter() {
        return shelter;
    }

    public void setShelter(String shelter) {
        this.shelter = shelter;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProvidedby() {
        return providedby;
    }

    public void setProvidedby(String providedby) {
        this.providedby = providedby;
    }

    public String getDonatedon() {
        return donatedon;
    }

    public void setDonatedon(String donatedon) {
        this.donatedon = donatedon;
    }

    public int getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(int TotalCost) {
        this.TotalCost = TotalCost;
    }

    
    
}
