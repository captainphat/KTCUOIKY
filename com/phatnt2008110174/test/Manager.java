/*
* create date: 18 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.test;

import java.util.ArrayList;
import java.util.Collections;
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

    public void showHead(){

        System.out.println("=============================================================================================");
        
        System.out.println("|   Type    |        Name       |    ID     |    Price    |  Quantity    |   Import Date    |");

        System.out.println("|===========|===================|===========|=============|==============|==================|");
    }
    public void showEnd(){

        System.out.println("=============================================================================================");

    }

  public boolean RemoveID(String iD){
    for (Product product : list) {
        
        if(product.getID().equalsIgnoreCase(iD) ){
           
            System.out.println("Removed!");
            return  list.remove(product);
        }
    } 
    System.out.println("Not found !!!");
    return false;
  }

    public boolean changeName(String iD){
      
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
                return  true;
        } 
        }
        System.out.println("Not found !!!");
        return false;
    }

    public boolean changePrice(String iD){
       
        for (Product product : list){
           
            if(product.getID().equalsIgnoreCase(iD)){
                System.out.println("ID of Product: "+iD);
                System.out.print("Enter the price to change : ");
                Double price = InputTool.input.nextDouble();
                product.setPrice(price);
                ClearScreen.clear();
                System.out.println("ID of Product: "+iD);
                System.out.println("Change Price to: "+ product.getPrice());
                return  true;
            }
            
        } 
        System.out.println("Not found !!!");
        return false;
    }

    public boolean changeImprotDate(String iD){
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
                return  true;
            }
        }
        System.out.println("Not fount");
        return false;
    }

    public boolean changeQuantity(String iD){
        
        for (Product product : list){
           
            if(product.getID().equalsIgnoreCase(iD)){
                System.out.println("ID of Product: "+iD);
                System.out.print("Enter the quantity to change : ");
                int quantity = InputTool.input.nextInt();
                product.setInventory(quantity);
                ClearScreen.clear();
                System.out.println("ID of Product: "+iD);
                System.out.println("Change Price to: "+ product.getInventory());
                return true;
            }
            
            
            
        }
            System.out.println("Not found !!!");
        return false;
    }

    public void sortPriceIncrease (){
       Collections.sort(list , new CompareUP());
       for (Product product : list){
           product.print();
       }
    }

    public void sortPriceDecrease (){
        Collections.sort(list, new CompareDow());
        for (Product product : list){
            product.print();
        }
    }

    public void sortID(){
        Collections.sort(list, new ComparatorID());
       showHead();
       for (Product product : list){
        if(product instanceof Food){
            product.print();
        }
     }

     for (Product product : list) {
         if(product instanceof Ceramic){
            product.print();
         }
     }

     for (Product product : list) {
         if(product instanceof Electronic){
            product.print();
         }
     }
     showEnd();
        
    }

    public void sortDateNew(){
        Collections.sort(list, new CompareDateNew());
        for (Product product : list){
            product.print();
        }
    }

    public void sortDateOld(){
        Collections.sort(list, new CompareDateOld());
    }

    public void sortTypeDate(){
        Collections.sort(list, new CompareDateNew());
        showHead();
        for (Product product : list){
           if(product instanceof Food){
               product.print();
           }
        }
        for (Product product : list) {
            if(product instanceof Ceramic){
                product.print();
            }
        }
        for (Product product : list) {
            if(product instanceof Electronic){
                product.print();
            }
        }
        showEnd();
    }
    public void sortTypePrice(){
        Collections.sort(list , new CompareUP());
        showHead();
        for (Product product : list){
           if(product instanceof Food){
               product.print();
           }
        }
        for (Product product : list) {
            if(product instanceof Ceramic){
                product.print();
            }
        }
        for (Product product : list) {
            if(product instanceof Electronic){
                product.print();
            }
        }
        showEnd();
    }
    public void searchType (String type){

        int Count = 0;
        showHead();
        for (Product product : list ){
            if(product.getType().equalsIgnoreCase(type)) {
                product.print();
                Count++;
            }
        }
       if (Count == 0) {
           System.out.println("Not found");
       }
       showEnd();
    }
    public void searchPrice(double min, double max){
        int Count = 0;
        showHead();
        for (Product product : list){
            if (product.getPrice() >= min && product.getPrice() <= max){
                product.print();
                Count ++;
            }
        }
        if (Count == 0){
            System.out.println("Not found");
        }
        showEnd();
    }
    public void searchDate(String oldest, String lastest)
	{
		int count = 0;
		Date oldDate = FormatDate.date(oldest);
		Date lastDate = FormatDate.date(lastest);
		showHead();
		for (Product product : list) {
			if(product.getDate().compareTo(oldDate) >= 0 && product.getDate().compareTo(lastDate) <= 0 ){
				product.print();
				count ++;
			}
		}
		if(count == 0)
			System.out.println("Not found");
		showEnd();
	}
 }      

