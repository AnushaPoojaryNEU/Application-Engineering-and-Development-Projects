/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author archil
 */
    public class Product {

    private String prodName;
    private double price;
    private String modelNumber;
    private boolean avail;
    private int year;
    private int seats;
    private String serialNumber;
    private String addr;
    private boolean expiredMainCerti;
    private String fleetTimeStamp;
    private String btnObject;

    
   // private static int count = 0;

    @Override
    public String toString() {
        return prodName; //To change body of generated methods, choose Tools | Templates.
    }

    public Product() {
       // count++;
       // modelNumber = count;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public boolean getAvail() {
        return avail;
    }

    public void setAvail(boolean avail) {
        this.avail = avail;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public boolean getExpiredMainCerti() {
        return expiredMainCerti;
    }

    public void setExpiredMainCerti(boolean expiredMainCerti) {
        this.expiredMainCerti = expiredMainCerti;
    }

    public String getFleetTimeStamp() {
        return fleetTimeStamp;
    }

    public void setFleetTimeStamp(String fleetTimeStamp) {
        this.fleetTimeStamp = fleetTimeStamp;
    }

    public String getBtnObject() {
        return btnObject;
    }

    public void setBtnObject(String btnObject) {
        this.btnObject = btnObject;
    }
    
   

   
}
