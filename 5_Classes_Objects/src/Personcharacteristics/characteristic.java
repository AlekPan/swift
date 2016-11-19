/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personcharacteristics;

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
         double avg;
         double avg1;
         double avg2;
         double avg3;
           
             
    public characteristic(String firstnameVar, String lastnameVar,String genderVar,int years_bornVar, double weightVar, double heightVar, String professionVar, double avg1Var,double avg2Var,double avg3Var)
         {
        firstname = firstnameVar;
        lastname =  lastnameVar;
         gender = genderVar;
            years_born =      years_bornVar;
             weight =    weightVar;
                height =          heightVar;
                 profession =   professionVar;
                 
                         avg1 = avg1Var;
                         avg2 = avg2Var;
                         avg3 = avg3Var;
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
         
         
         
        
         
         avg = (avg1 + avg2 + avg3)/3;
         int recent_year1=2016;
         years = recent_year1 - years_born;
        System.out.printf("%s %s is %s old. %s was born in %s. %s weight is %.2f and %s is %.2f cm tall. %s is a %s with an average grade of %.2f.", firstname, lastname, years, Pol2, years_born, Pol, weight,Pol1, height,Pol2, profession,avg);
            if (years < 18) {
                System.out.printf(" %s %s is under-age.", firstname, lastname);
       
// firstname, lastname,gender, years_born,  weight,height, avg1, avg2,avg3);





}
        }
}

    

