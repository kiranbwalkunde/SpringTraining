/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojos;

import java.util.ArrayList;
import java.util.List;

/**
 * POJO class to demonstrate Bean Initialization and Destruction. 
 * 
 * @author kiran. Created on 19/03/2016.
 */
public class ShoppingCart {
    
    private List<Product> items;

    public ShoppingCart() {
        Battery b1 = new Battery("Lenovo", 1200);
        Battery b2 = new Battery("Sony", 1300);
        Disc d1 = new Disc("SamSung", 20);
        Disc d2 = new Disc("Vista", 30);
        
        this.items.add(b1);
        this.items.add(b2);
        this.items.add(d1);
        this.items.add(d2);
    }

    
    
    public List<Product> getItems() {
      //  return items;
        return items;
    }

    public void setItems(List<Product> items) {
    //    this.items = items;
        Battery b1 = new Battery("Lenovo", 1200);
        Battery b2 = new Battery("Sony", 1300);
        Disc d1 = new Disc("SamSung", 20);
        Disc d2 = new Disc("Vista", 30);
        
        this.items.add(b1);
        this.items.add(b2);
        this.items.add(d1);
        this.items.add(d2);
    }
    
}
