/*
* create date: 18 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.test;

public class Menu {
    Food Carrot = new Food("Carrot",  0.99, 500,FormatDate.date("1/11/2021"));
    Food Tomato = new Food("Tomato", 0.99, 600, FormatDate.date("1/11/2021"));
     Food Potato = new Food("Potatp", 0.99, 500, FormatDate.date("1/11/2021"));
    Food Watermelon = new Food("Watermelon", 1.99, 1000, FormatDate.date("20/11/2021"));
    Food Appble = new Food("Appble", 0.99, 650, FormatDate.date("20/11/2021"));
    Ceramic Bowl = new Ceramic("Bowl", 1.99, 1000, FormatDate.date("27/11/2021"));
    Ceramic Glass = new Ceramic("Glass", 0.99, 500, FormatDate.date("26/11/2021"));
    Ceramic Cup = new Ceramic("Cup", 2.99, 600, FormatDate.date("29/11/2021"));
    Electronic LaptopGM = new Electronic("Acer Nitro 5", 1200, 50,FormatDate.date("20/11/2021"));
    Electronic LaptopOF = new Electronic("DELL inspiron 3505", 700, 52, FormatDate.date("1/11/2021"));
    Electronic LaptopGM1 = new Electronic("MSI Creator Z16", 3200, 20, FormatDate.date("2/9/2021"));
    Electronic TVSamSung = new Electronic("TV SamSung 58RU7100", 1200, 30, FormatDate.date("15/11/2021"));
    Food Meat = new Food("Meat", 1.5, 100, FormatDate.date("1/11/2021"));
    Food Beef = new Food("Beef", 2.5, 500, FormatDate.date("1/11/2021"));
    Ceramic potCeramic = new Ceramic ("Pot Ceramic",3.5,100,FormatDate.date("5/11/2021"));
    Electronic Iphone = new Electronic ("Iphone 13",2000,50,FormatDate.date("12/10/2021"));
    Food Rice = new Food("Rice", 0.99, 500, FormatDate.date("10/11/2021"));
    Food Fish = new Food("Fish", 1.99, 300, FormatDate.date("12/11/2021"));
    Ceramic Plate = new Ceramic("Palte", 3.99, 500, FormatDate.date("3/11/2021"));
    Electronic PS5 = new Electronic("PS5", 1000, 48, FormatDate.date("6/11/2021"));
   Manager list = new Manager();
   
   Product product;
   private int choic;
   public int getChoic() {
    return choic;
}

public  void setChoic(int choic) {
    this.choic = choic;
}
 
    public  void getMenu (){
        ClearScreen.clear();
        menu();
    }
    public void autoInput(){
            list.add(Carrot);
            list.add(Cup);
            list.add(Tomato);
            list.add(Potato);
            list.add(Watermelon);
            list.add(Appble);
            list.add(Bowl);
            list.add(Glass);
            list.add(LaptopGM);
            list.add(LaptopGM1);
            list.add(LaptopOF);
            list.add(TVSamSung);
            list.add(Meat);
            list.add(Beef);
            list.add(potCeramic);
            list.add(Iphone);
            list.add(Rice);
            list.add(Fish);
            list.add(Plate);
            list.add(PS5);
    }
    public  void menu(){
        int x;
        do{
            
            list.show();
            System.out.println("          Menu            ");
            System.out.println("1. ADD  ");
            System.out.println("2. Remove    ");
            System.out.println("3. Change");
            System.out.println("4. Sort");
            System.out.println("0. Exit");
            System.out.print("Your choose: ");
            x = InputTool.input.nextInt();
            ClearScreen.clear();
            setChoic(x);
              switch (getChoic()) {
                case 0:  
                    System.out.println("Exit!!");
                    break;
                case 1:
                    menuAdd(); //add
                    break;
                case 2:
                    menuRemove();
                    break;
                case 3:
                    MeneChange();
                    break;
                case 4:
                    menuSort();
                    break;
                default:
                    System.out.println("tinh nang chua duoc cap nhat");
                
              }
          }while(choic != 0 && choic<0);
    }
    public void menuAdd(){
        int xx;
        do{
            FoodManager foodManager = new FoodManager();
            CeramicManager ceramicManager = new CeramicManager();
            ElectronicManager electronicManager = new ElectronicManager();
            list.show();
            System.out.println("Choose product to add ");
            System.out.println("1. FOOD");
            System.out.println("2. CERAMIC");
            System.out.println("3. ELECTRONIC");
            System.out.println("4.Back to menu ");
            System.out.print("Your choose: ");
            xx = InputTool.input.nextInt();
            ClearScreen.clear();
            setChoic(xx);
              switch (getChoic()) {
                  case 1:
                      Food food = foodManager.inputFood();
                      list.add(food);
                      getMenu();
                      break;
                    case 2:
                        Ceramic ceramic = ceramicManager.inputcCeramic();
                        list.add(ceramic);
                        getMenu();
                        break;
                    case 3:
                        Electronic electronic = electronicManager.inputcElectronic();
                        list.add(electronic);
                        getMenu();
                        break;
                  case 4: 
                      getMenu();
                  default:
                      break;
              }
              ClearScreen.clear();
      }while(getChoic() == 0 && getChoic() !=0);
   }
public void menuRemove (){
    
    do{
        
        list.show();
        String iD;
        int xxx;
        System.out.println("Remove !!! ");
        System.out.println("1. Remove ");
        System.out.println("2. Back to menu");
        System.out.println("Your choose: ");
        xxx = InputTool.input.nextInt();
        ClearScreen.clear();
        setChoic(xxx);
        switch (getChoic()) {
            case 1:
                list.show();
                System.out.print("Product ID: ");
                String tempID = InputTool.input.nextLine();
                iD = tempID;
                iD = InputTool.input.nextLine();
                list.RemoveID(iD);
                ClearScreen.clear();
                getMenu();
                break;
            
            default:
                getMenu();
                break;
        }
    }while(getChoic() == 0 && getChoic() !=0);
}
public void MeneChange (){
    do{
        list.show();
        System.out.println("Change information of product");
        System.out.print("Product ID: ");
        String oID = InputTool.input.nextLine();
        String TempoID = InputTool.input.nextLine();
        oID = TempoID;
        ClearScreen.clear();
        list.show();
        // System.out.println("Mã sản đang được đổi: "+product.getID());
        System.out.println("1. Change name");
        System.out.println("2. Change price");
        System.out.println("3.Change import date");
        System.out.println("4. Change quantity");
        System.out.print("Your choose: ");
        int Ochose = InputTool.input.nextInt();
        setChoic(Ochose);
        ClearScreen.clear();
        switch (getChoic()) {
            case 1:
            list.show();
            System.out.println("    Change name ");
            list.changeName(oID);
            list.show();
            System.out.println("Enter to continue");
            InputTool.input.nextLine();
            ClearScreen.clear();
            getMenu();
            case 2:
            list.show();
            System.out.println("    Change price");
            list.changePrice(oID);
            InputTool.input.nextLine();
            list.show();
            System.out.println("Enter to continue");
            InputTool.input.nextLine();
            ClearScreen.clear();
            getMenu();
            case 3:
            list.show();
            System.out.println("    Change import date");
            list.changeImprotDate(oID);
            list.show();
            System.out.println("Enter to continue");
            InputTool.input.nextLine();
            ClearScreen.clear();
            case 4:
            list.show();
            System.out.println("    Change quantity");
            list.changeQuantity(oID);
            InputTool.input.nextLine();
            list.show();
            System.out.println("Enter to continue");
            InputTool.input.nextLine();
            ClearScreen.clear();
            getMenu();
            default:
                break;
        }
    }while(getChoic() == 0 && getChoic() !=0);
}
public void menuSort(){
    do{
        list.show();
        System.out.println("    Sort    ");
        System.out.println("1.Type");
        System.out.println("2.Import date");
        System.out.println("3.Price");
        System.out.println("4.Type & import date");
        System.out.println("5.Type & price");
        System.out.print("Your choose: ");
        int a = InputTool.input.nextInt();
        setChoic(a);
        
        switch (getChoic()) {
            case 1:
                System.out.println("Sort Type");
                break;
            case 2:
                System.out.println("sort Import date");
            case 3 :
                System.out.println("Sort Price");
                list.SortPrice();
                ClearScreen.stop();
                
                getMenu();
                
            default:
                break;
        }
    }while(getChoic()<0 && getChoic() != 0);
}
}



