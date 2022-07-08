/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
   ArrayList<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        this.deliveryManList = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
 
    public DeliveryMan createDeliveryMan(String name, String username) {
        DeliveryMan deliveryMan = new DeliveryMan(name, username);
        if (!deliveryManList.contains(deliveryMan)) {
            deliveryManList.add(deliveryMan);
            return deliveryMan;
        }
        else{
            return null;
        }
    }

    public void deleteDeliveryMan(DeliveryMan deliveryMan) {
        deliveryManList.remove(deliveryMan);
    }

}
