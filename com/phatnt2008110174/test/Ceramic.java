/*
* create date: 18 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.test;

import java.util.Date;

public class Ceramic extends Product {
    static int Count;
    public Ceramic(String Name,double Price, int Inventory, Date date) {
        super(Name, "CC"+" "+Count,Price, Inventory, "CERAMIC", date);
        Count++;
        
        
    }

    public Ceramic() {
    }
    @Override
    public void print() {
        System.out.printf("│%11s│%19s│%11s│%8s$/Per│%8s piece│%18s│\n",getType(),getName(),getID(),getPrice(),getInventory(),FormatDate.formatDate.format(this.getDate()));
    }

    public static int getCount() {
        return Count;
    }

    public static void setCount(int count) {
        Count = count;
    }

    
}
