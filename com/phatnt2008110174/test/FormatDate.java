/*
* create date: 18 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FormatDate {
    static SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
    public static Date date (String inputDate){
        Date  imporDate = null;
        if (inputDate.equals(" "))
            imporDate = null;
        else
        {
                try{
                        imporDate =  formatDate.parse(inputDate);
                }catch (ParseException ex){
                        Logger.getLogger(Product.class.getName()).log(Level.SEVERE,null,ex);
                }
        }
        return imporDate;
        
    }
    public static Date date(int i) {
        return null;
    }
}
