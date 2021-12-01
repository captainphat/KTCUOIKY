/*
* create date: 01 thg 12, 2021
* author: captainPhat
*/
package com.phatnt2008110174.test;

import java.util.Comparator;

public class CompareDateNew implements Comparator<Product>{

    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getDate() == product2.getDate())
            return 0;
        else if(product1.getDate().before(product2.getDate()))
            return 1; 
        else 
            return -1;
    }
}