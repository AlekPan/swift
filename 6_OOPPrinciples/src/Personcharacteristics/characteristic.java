/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personcharacteristics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Aleksandar
 */




public class characteristic {
     String firstname;
     String lastname;
     int years_born;
     int year;
     double weight;
     double height;
     String profession;
     String gender;
      String Pol;
       String Pol1;
        String Pol2;
         int years;
          String Date_born;
           
             
    public characteristic (String firstnameVar, String lastnameVar,String genderVar,double heightVar )
         {
        firstname = firstnameVar;
        lastname =  lastnameVar;
         gender = genderVar;
             
             
                height =          heightVar;
                  
                     // firstname, lastname,gender, years_born,  weight,height, profession avg1, avg2,avg3);
    
    }


      

          
           
    
    
     public void saying() {
         
          

         
         
         
           if("f".equals(gender)) {
              Pol = "Her";
           }
           else if("m".equals(gender)) {
               Pol = "His";
           }
                
            
           if("f".equals(gender)) {
              Pol1 = "she";
           }
           else if("m".equals(gender)) {
              Pol1 = "he";
           }
           
           
           if("f".equals(gender)) {
              Pol2 = "She";
           }
           else if("m".equals(gender)) {
              Pol2 = "He";
           }
         
         
         
        
         
     
        System.out.printf("");
            if (years < 18) {
                System.out.printf(" %s %s is under-age.", firstname, lastname);
       
// firstname, lastname,gender, years_born,  weight,height, avg1, avg2,avg3);





}
        }
}
     
    

    

