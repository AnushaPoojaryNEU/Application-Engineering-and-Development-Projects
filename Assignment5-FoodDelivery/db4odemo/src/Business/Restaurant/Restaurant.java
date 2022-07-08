/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;


import Business.Customer.Order;
import Business.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Restaurant extends Organization {
    
    String name;
    String address;
    String restaurantAdminUsername;
    String phoneNumber;
    String email;
    List<Menu> menu;

     public Restaurant(String name,String address,String phoneNumber,String email,String restaurantAdminUsername) {
        super(null);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email =email;
        this.restaurantAdminUsername = restaurantAdminUsername;
        this.menu = new ArrayList<Menu>();
    }    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRestaurantAdminUsername() {
        return restaurantAdminUsername;
    }

    public void setRestaurantAdminUsername(String restaurantAdminUsername) {
        this.restaurantAdminUsername = restaurantAdminUsername;
    }

    public List<Menu> getMenu() {
        if(menu == null)
        {
            menu = new ArrayList();
        }
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }
    
    @Override
    public String toString(){
        return this.getRestaurantAdminUsername();
    }
   
      
     @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
