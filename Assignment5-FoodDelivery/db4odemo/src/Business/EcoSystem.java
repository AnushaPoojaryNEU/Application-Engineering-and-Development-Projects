/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public EcoSystem() {
        super(null);
        customerDirectory = new CustomerDirectory();
        restaurantDirectory = new RestaurantDirectory();
        deliveryManDirectory = new DeliveryManDirectory();
    }


    public RestaurantDirectory getRestaurantDirectory() {
        if(restaurantDirectory == null)
        {
            restaurantDirectory = new RestaurantDirectory();
        }
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        if(customerDirectory == null)
        {
            customerDirectory = new CustomerDirectory();
        }
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    
    public DeliveryManDirectory getDeliveryManDirectory() {
        if(deliveryManDirectory == null)
        {
            deliveryManDirectory = new DeliveryManDirectory();
        }
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    //Create Customer
    public Customer createCustomerDirectory(String name,String username) {
        Customer customer = customerDirectory.createCustomer(name,username);
        return customer;
    }
 
    //Create restaurant
    public Restaurant createAndAddRestaurant(String name, String address, String phoneNumber,String email, String username) {
        Restaurant restaurant = restaurantDirectory.createRestaurant(name,address,phoneNumber,email,username);
        return restaurant;
    }
    
    //CreateDeliveryMan
     public DeliveryMan createDeliveryMan(String name,String username) {
        DeliveryMan deliveryMan = deliveryManDirectory.createDeliveryMan(name,username);
        return deliveryMan;
    }
    
    
    public boolean checkIfUserIsUnique(String userName) {
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
        {
            return false;
        }
        return true;
    }
}
