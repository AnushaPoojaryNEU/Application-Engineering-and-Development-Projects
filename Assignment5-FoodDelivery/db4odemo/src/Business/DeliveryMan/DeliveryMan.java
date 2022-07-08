/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan extends Organization{
    String name;
    String deliveryManUserName;

    public DeliveryMan(String name,String deliveryManUserName) {
        super(name);
        this.name = name;
        this.deliveryManUserName = deliveryManUserName;
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryManUserName() {
        return deliveryManUserName;
    }

    public void setDeliveryManUserName(String deliveryManUserName) {
        this.deliveryManUserName = deliveryManUserName;
    }
    
    
    @Override
    public String toString(){
        return this.getDeliveryManUserName();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
