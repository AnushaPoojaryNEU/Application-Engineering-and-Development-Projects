/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author harold
 */
public class Customer {
    private String name;
    private String custUserName;
    private String address;
    
    public Customer(String name,String username) {
        this.name = name;
        this.custUserName = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustUserName() {
        return custUserName;
    }

    public void setCustUserName(String custUserName) {
        this.custUserName = custUserName;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    @Override
    public String toString(){
        return this.getCustUserName();
    }
}
