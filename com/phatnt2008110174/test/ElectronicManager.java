/*
* create date: 18 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.test;

import java.util.Date;

public class ElectronicManager {
    static Electronic  electronic;
    public Electronic inputcElectronic(){
        InputTool.input.nextLine();
        System.out.println("ELECTRONIC");
        System.out.print("Enter the name: ");
        String Name = InputTool.input.nextLine();
        System.out.print("Enter import date: ");
        String dateString = InputTool.input.nextLine();
        System.out.print("Enter price: ");
        Double Price = InputTool.input.nextDouble();
        System.out.print("Enter quantity: ");
        int Inventory = InputTool.input.nextInt();
        Date date = FormatDate.date(dateString);
        FormatDate.formatDate.format(date);
        ClearScreen.clear();
        return electronic = new Electronic(Name, Price, Inventory,  date);
    }
}
