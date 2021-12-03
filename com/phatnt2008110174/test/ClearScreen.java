/*
* create date: 19 thg 11, 2021
* author: captainPhat
*/
package com.phatnt2008110174.test;

public class ClearScreen {
    static public void clear()

    {

            try {

                    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

            } catch (Exception E) {

                    {

                            System.out.println(E);

                    }

            }

    }
    
    static public void stop(){
        
        System.out.println("Enter to continued");
        InputTool.input.nextLine();
    }
}
