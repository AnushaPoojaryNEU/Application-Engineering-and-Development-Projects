/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author archil
 */
public class ProductCatalog {

    private List<Product> productCatalog;

    public ProductCatalog() {
        productCatalog = new ArrayList<Product>();
    }

    public List<Product> getProductcatalog() {
        return productCatalog;
    }

    public Product addProduct() {
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }

    public void removeProduct(Product p) {
        productCatalog.remove(p);
    }

    public Product searchProduct(String model) {
        for (Product product : productCatalog) {
            if (product.getModelNumber() == model) {
                return product;
            }
        }
        return null;
    }
    
    public Product searchFirstAvailCar(String loc) {
        
        for (Product product : productCatalog) {
            if (product.getAddr().equalsIgnoreCase(loc)) {
                return product;
            }
        }
        return null;
    }
    
    public Product searchCarByYear(int year) {
        
        for (Product product : productCatalog) {
            if (product.getYear()== year) {
                return product;
            }
        }
        return null;
    }
    
     public Product searchAvailSeat(int maxSeat) {
        
        for (Product product : productCatalog) {
            if (product.getSeats() <= maxSeat) {
                return product;
            }
        }
        return null;
    }
     
     public Product searchSerialNum(String serialNum) {
        
        for (Product product : productCatalog) {
            if (product.getSerialNumber().equals(serialNum)) {
                return product;
            }
        }
        return null;
    } 
     
      public Product searchModelNum(String ModelNum) {
        
        for (Product product : productCatalog) {
            if (product.getModelNumber().equals(ModelNum)) {
                return product;
            }
        }
        return null;
    }
      
      public Product searchExpiredCerti() {
        
        for (Product product : productCatalog) {
            if (product.getExpiredMainCerti()) {
                return product;
            }
        }
        return null;
    }
      public Product searchCarAvailable() {
        
        for (Product product : productCatalog) {
            if (product.getAvail()) {
                return product;
            }
        }
        return null;
    }
       public Product getFleetTimestamp() {
        
        for (Product product : productCatalog) {
            if (product.getFleetTimeStamp().isEmpty()==false) {
                return product;
            }
        }
        return null;
    }
}
