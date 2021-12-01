/*
* create date: 29 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.test;

import java.util.Comparator;

public class CompareUP implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
      if (product1.getPrice() == product2.getPrice())
        return 0;
        else if(product1.getPrice() > product2.getPrice())
            return 1;
        else
            return -1;
    }
    
}
