/*
* create date: 18 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.test;

import java.util.Date;

public class FoodManager {
    static Food food;
    public Food inputFood(){
        InputTool.input.nextLine();
        System.out.println("FOOD");
        System.out.print("Enter the name: ");
        String Name = InputTool.input.nextLine();
        System.out.print("Enter inport date: ");
        String dateString = InputTool.input.nextLine();
        System.out.print("Enter price: ");
        Double Price = InputTool.input.nextDouble();
        System.out.print("Enter quantity: ");
        int Inventory = InputTool.input.nextInt();
        Date date = FormatDate.date(dateString);
        FormatDate.formatDate.format(date);
        ClearScreen.clear();
        return food = new Food(Name, Price, Inventory,  date);
        
    }
}
