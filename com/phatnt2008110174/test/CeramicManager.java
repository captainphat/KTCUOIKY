/*
* create date: 18 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.test;

import java.util.Date;

public class CeramicManager {
    static Ceramic ceramic;
    public Ceramic inputcCeramic(){
        InputTool.input.nextLine();
        System.out.println("CERAMIC");
        System.out.print("Enter the name: ");
        String Name = InputTool.input.nextLine();
        System.out.print("Enter import date: ");
        String dateString = InputTool.input.nextLine();
        System.out.print("Enter price: ");
        Double Price = InputTool.input.nextDouble();
        System.out.print("Enter Quantity: ");
        int Inventory = InputTool.input.nextInt();
        Date date = FormatDate.date(dateString);
        FormatDate.formatDate.format(date);
        ClearScreen.clear();
        return ceramic = new Ceramic(Name,Price, Inventory,  date);
    }
}
