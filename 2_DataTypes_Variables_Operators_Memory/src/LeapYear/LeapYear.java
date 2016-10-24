package LeapYear;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleksandar
 */
public class LeapYear {
      public static void main(String[] args) {
        int year=2001;
        
       boolean isLeapYear1= year%4==0 ^ year%100==0 ^ year%400==0;
       
        
      
        
        //
     // 2016 = t + f + f = t
      //  1992 =       t + f + f = t
        //  2001 =             f + f + f = f
         //                      1900 = t + t + f = f 
            //                           2400 = t + t + t = t //
       
       
        
        System.out.print(isLeapYear1 + "     ");
        
        
}
}
