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
       list.show();
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
            
            System.out.println("          Menu            ");
            System.out.println("1. ADD  ");
            System.out.println("2. Remove    ");
            System.out.println("3. Change");
            System.out.println("4. Sort");
            System.out.println("5.Search");
            System.out.println("6.Statistical");
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
                case 5:
                    menuSearch();
                case 6:
                    menuStatistical();
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
            System.out.println("0.Back to menu ");
            System.out.print("Your choose: ");
            xx = InputTool.input.nextInt();
            ClearScreen.clear();
            setChoic(xx);
              switch (getChoic()) {
                  case 1:
                      Food food = foodManager.inputFood();
                      list.add(food);
                      ClearScreen.stop();
                      getMenu();
                      break;
                    case 2:
                        Ceramic ceramic = ceramicManager.inputcCeramic();
                        list.add(ceramic);
                        ClearScreen.stop();
                        getMenu();
                        break;
                    case 3:
                        Electronic electronic = electronicManager.inputcElectronic();
                        list.add(electronic);
                        ClearScreen.stop();
                        getMenu();
                        break;
                  case 0:
                     ClearScreen.stop(); 
                      getMenu();
                  default:
                      break;
              }
      }while(getChoic() == 0 && getChoic() !=0);
   }
public void menuRemove (){
    
    do{
        list.show();
        String iD;
        int xxx;
        System.out.println("Remove !!! ");
        System.out.println("1. Remove ");
        System.out.println("0. Back to menu");
        System.out.println("Your choose: ");
        xxx = InputTool.input.nextInt();
        ClearScreen.clear();
        setChoic(xxx);
        switch (getChoic()) {
            case 1:
                ClearScreen.stop();
                list.show();
                System.out.print("Product ID: ");
                String tempID = InputTool.input.nextLine();
                iD = tempID;
                iD = InputTool.input.nextLine();
                list.RemoveID(iD);
                ClearScreen.stop();
                getMenu();
                break;
            case 0:
                getMenu();
            default:
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
                ClearScreen.stop();
                list.show();
                System.out.println("    Change name ");
                list.changeName(oID);
                list.show();
                System.out.println("Enter to continue");
                InputTool.input.nextLine();
                getMenu();
            case 2:
                ClearScreen.stop();
                list.show();
                System.out.println("    Change price");
                list.changePrice(oID);
                InputTool.input.nextLine();
                list.show();
                System.out.println("Enter to continue");
                InputTool.input.nextLine();
                getMenu();
            case 3:
                ClearScreen.stop();
                list.show();
                System.out.println("    Change import date");
                list.changeImprotDate(oID);
                list.show();
                System.out.println("Enter to continue");
                InputTool.input.nextLine();
                getMenu();
            case 4:
                ClearScreen.stop();
                list.show();
                System.out.println("    Change quantity");
                list.changeQuantity(oID);
                InputTool.input.nextLine();
                list.show();
                System.out.println("Enter to continue");
                InputTool.input.nextLine();
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
        System.out.println("3.Price Increase");
        System.out.println("4.Price Decrease");
        System.out.println("5.Date New");
        System.out.println("6.Date Oldest");
        System.out.println("7.Type & import date");
        System.out.println("8.Type & price");
        System.out.println("0. Back to menu");
        System.out.print("Your choose: ");
        int a = InputTool.input.nextInt();
        setChoic(a);
        ClearScreen.clear();
        switch (getChoic()) {
            case 0:
                getMenu();
            case 1:
                list.sortID();
                ClearScreen.stop();
                
                menu();
                break;
            case 2:
                System.out.println("sort Import date");
            case 3 :
                System.out.println("Sort Price Increase");
                list.sortPriceIncrease();
                ClearScreen.stop();
                 getMenu();
            case 4:
                System.out.println("Sort Price Decrease");
                list.sortPriceDecrease();
                ClearScreen.stop();
                getMenu();
            case 5:
                System.out.println("Sort Date New");
                list.sortDateNew();
                ClearScreen.stop();
                getMenu();
            case 6:
                System.out.println("Sort Date Oldest");
                list.sortDateOld();
                ClearScreen.stop();
                getMenu();
            case 7:
                System.out.println("Sort type & import date");
                list.sortTypeDate();
                ClearScreen.stop();
                menu();
            case 8:
                System.out.println("Sort type & price");
                list.sortTypePrice();
                ClearScreen.stop();
                menu();
            default:
                
        }
    }while(getChoic()<0 && getChoic() != 0);
}
    public void menuSearch(){
        do {
            list.show();
            System.out.println("    Search  ");
            System.out.println("1.Search type");
            System.out.println("2.Seach price");
            System.out.println("3.Seach date");
            System.out.println("0.Back to menu");
            int a = InputTool.input.nextInt();
            setChoic(a);
            ClearScreen.clear();
            switch (getChoic()) {
                case 1:
                    ClearScreen.stop();
                    list.show();
                    System.out.println("Seach Type");
                    System.out.println("Type: Food, Electronic, Ceramic");
                    System.out.print("Enter your type:");
                    String type = InputTool.input.nextLine();
                    ClearScreen.clear();
                    list.searchType(type);
                    menu();
                    break;
                case 2:
                    ClearScreen.stop();
                    ClearScreen.clear();
                    list.show();
                    System.out.println("Seach Price");
                    System.out.print("Enter your min price ");
                    double min = InputTool.input.nextDouble();
                    System.out.print("Enter your max price ");
                    double max = InputTool.input.nextDouble();
                    ClearScreen.clear();
                    list.searchPrice(min, max);
                    menu();
                case 3:
                    ClearScreen.stop();
                    ClearScreen.clear();
                    list.show();
                    System.out.println("Seach Date");
                    System.out.print("Enter your old Date:");
                    String oldest = InputTool.input.nextLine();
                    System.out.print("Enter your lastest Date:");
                    String lastest = InputTool.input.nextLine();
                    ClearScreen.clear();
                    list.searchDate(oldest, lastest);
                    menu();
                case 0:
                getMenu();
                default:
                    break;
            }
        }while(getChoic()<0 && getChoic() != 0);
    }
    public void menuStatistical(){
       ClearScreen.stop();
       list.headStatistic();
       list.quantityOfType();
       list.endStatistic();
       list.quantityOfProduct();
       list.endStatistic();
       list.totalOfPrice();
       list.endStatistic();
       ClearScreen.stop();
       getMenu();
    }
}



