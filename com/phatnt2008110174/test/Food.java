/*
* create date: 18 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.test;

import java.util.Date;

public class Food extends Product {
    static int count;
    public Food(String Name, double Price, int Inventory, Date date) {
        super(Name,"FD"+" "+count, Price, Inventory,"FOOD", date);
       count++;
    }
    
    public Food() {}
        @Override
        public void print() {
            System.out.printf("│%11s│%19s│%11s│%8s $/Kg│%11s Kg│%18s│\n",getType(),getName(),getID(),getPrice(),getInventory(),FormatDate.formatDate.format(this.getDate()));
        }
        @Override
        public void Statistic() {
            System.out.printf("│%11sSum of Product: │%19s│%11s Sum of Price: │%19s│\n",getSumOfProduct(),getSumOfPrice());
        }
}
