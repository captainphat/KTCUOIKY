/*
* create date: 18 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.test;

import java.util.ArrayList;

import java.util.Date;

public class Manager {
    private  ArrayList<Product> list = new ArrayList<>();
    public void add (Product product){
        list.add(product);
    }
    public void show(){

        System.out.println("=============================================================================================");
        
        System.out.println("|   Type    |        Name       |    ID     |    Price    |  Quantity    |   Import Date    |");
    

        System.out.println("|===========|===================|===========|=============|==============|==================|");
        for (Product product: list){
                
            product.print();  
                
               
        } 
        System.out.println("=============================================================================================");
    }

  public boolean RemoveID(String iD){
    for (Product product : list) {
        
        if(product.getID().equalsIgnoreCase(iD) ){
           
            System.out.println("Removed!");
            return  list.remove(product);
        }
        else{
            System.out.println("Not found !!!");
        }

    } 

    return false;
  }
    public boolean changeName(String iD){
        boolean check = true ;
        for (Product product : list){
           
            if(product.getID().equalsIgnoreCase(iD)){
                System.out.println("ID of Product: "+iD);
                String name = InputTool.input.nextLine();
                System.out.print("Enter the name to change : ");
                String oName = InputTool.input.nextLine();
                name = oName;
                product.setName(name);
                ClearScreen.clear();
                System.out.println("ID of Product: "+iD);
                System.out.println("Change name to: "+ product.getName());
                return check = true;
            }
            else{
                System.out.println("Not found !!!");
            }
            
        }
        return check;
    }
    public boolean changePrice(String iD){
        boolean check = true ;
        for (Product product : list){
           
            if(product.getID().equalsIgnoreCase(iD)){
                System.out.println("ID of Product: "+iD);
                System.out.print("Enter the price to change : ");
                Double price = InputTool.input.nextDouble();
                product.setPrice(price);
                ClearScreen.clear();
                System.out.println("ID of Product: "+iD);
                System.out.println("Change Price to: "+ product.getPrice());
                return check = true;
            }
            else{
                System.out.println("Not found !!!");
            }
            
        }
        return check;
    }
    public boolean changeImprotDate(String iD){
        boolean check = true ;
        for (Product product : list){
           
            if(product.getID().equalsIgnoreCase(iD)){
                System.out.println("ID of Product: "+iD);
                String dateString = InputTool.input.nextLine();
                System.out.print("Enter the import date to change : ");
                String odate = InputTool.input.nextLine();
                dateString = odate;
                Date date = FormatDate.date(dateString);
                FormatDate.formatDate.format(date);
                product.setDate(date);
                ClearScreen.clear();
                System.out.println("ID of Product: "+iD);
                System.out.println("Change improt date to: "+ FormatDate.formatDate.format(product.getDate()));
                return check = true;
            }
            else{
                System.out.println("Not found !!!");
            }
            
        }
        return check;
    }
    public boolean changeQuantity(String iD){
        boolean check = true ;
        for (Product product : list){
           
            if(product.getID().equalsIgnoreCase(iD)){
                System.out.println("ID of Product: "+iD);
                System.out.print("Enter the quantity to change : ");
                int quantity = InputTool.input.nextInt();
                product.setInventory(quantity);
                ClearScreen.clear();
                System.out.println("ID of Product: "+iD);
                System.out.println("Change Price to: "+ product.getInventory());
                return check = true;
            }
            else{
                System.out.println("Not found !!!");
            }
        }
        return check;
    }
    public Product SearchFOODType(String type){
        Product p = null;
        for (Product product : list){
            if (product instanceof Food){
                Food food = (Food)product;
                if (food.getType().equalsIgnoreCase(type)){
                    p = food;
                }
            }
        }
        return p;
    }
    // public void SortPrice (){
    //     Collections.sort(list, new Comparator<Product>() {
    //     @Override
    //     public int compare(Product product1, Product product2) {
    //         if(product1.getPrice() < product2.getPrice()){
    //             return -1;
    //         }else{
    //             if(product1.getPrice() == product2.getPrice()){
    //                 return 0;
    //             }else{
    //                 return -1;
    //             }
    //         }
    //     }
    //    });
    //    for(int i = 0; i < list.size();i++){
    //        show();
    //    }
    // }
}

