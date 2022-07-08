/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private List<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList();
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

     public Restaurant createRestaurant(String name, String address,String phoneNumber,String email,String username){
      Restaurant restaurant = new Restaurant(name,address,phoneNumber,email,username);
      restaurantList.add(restaurant);
      return restaurant;
   }
    
    public void deleteRestaurant(Restaurant restaurant){
        restaurantList.remove(restaurant);
    }
    
}
