/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anu61
 */
public class Business {
    //MasterCarList masterCarList;
    SupplierDirectory supplierDirectory;
    
    public Business(){
       // masterCarList = new MasterCarList();
        supplierDirectory = new SupplierDirectory();
    }

 

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    
    
}
