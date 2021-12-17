/*
* create date: 18 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.test;

import java.util.Date;
public abstract class Product {
    private String Name;
    private String ID;
    private double Price;
    private int Inventory;
    private String Type;
    private Date date;
    public Product(String Name,String ID, double Price, int Inventory, String Type, Date date) {
        this.Name = Name;
        this.Inventory = Inventory;
        this.Price = Price;
        this.ID=ID;
        this.Type = Type;
        this.date = date;
    }
    
    public Product() {
    }

  
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getInventory() {
        return Inventory;
    }

    public void setInventory(int inventory) {
        Inventory = inventory;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    public abstract  void print();
}
