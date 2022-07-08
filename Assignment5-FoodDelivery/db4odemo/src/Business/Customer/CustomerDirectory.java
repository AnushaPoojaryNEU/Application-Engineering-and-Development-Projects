/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    
    public Customer createCustomer(String name,String username){
        Customer customer = new Customer(name,username);
        if(!customerList.contains(customer)){
             customerList.add(customer);
              return customer;
        }
       return null;
       
    }
    
    public void removeCustomer(Customer cust){
        customerList.remove(cust);
    }
}
