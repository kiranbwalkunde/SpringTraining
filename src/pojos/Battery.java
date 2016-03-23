/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojos;

/**
 *
 * @author kiran
 */
public class Battery extends Product{
    
    private Boolean rechargeable;
    
    public Battery(){
        super();
    }
    
    public Battery(String name, double price){
        super(name, price);
    }

    public Boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(Boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
    
}
