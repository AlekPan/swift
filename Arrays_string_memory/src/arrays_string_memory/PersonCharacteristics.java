package arrays_string_memory;

import java.util.Scanner;

import java.util.regex.Pattern;

/**
 *
 * @author Aleksandar
 */
public class PersonCharacteristics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        String firstname = "";
        String lastname = "";
        int years_born = 0;
        int years = 0;
        double weight = 0;
        double height = 0;
        String profession = "";

        int chisla = user_input.nextInt();
         
        
        
        for (int i = 1; i <= chisla; i++) {
          
           String gender;
           System.out.println("Input gender (f - m):");
            gender = user_input.next();
            
           while (!Pattern.matches("[f,m]+", gender)) {
                System.out.println("Incorrect data. Input gender again(f or m):");
                gender = user_input.next();
           }
            
            
           String Pol = "";
           if("f".equals(gender)) {
              Pol = "Her";
           }
           else if("m".equals(gender)) {
              Pol = "His";
           }
                
            String Pol1 = "";
           if("f".equals(gender)) {
              Pol1 = "she";
           }
           else if("m".equals(gender)) {
              Pol1 = "he";
           }
           
           String Pol2 = "";
           if("f".equals(gender)) {
              Pol2 = "She";
           }
           else if("m".equals(gender)) {
              Pol2 = "He";
           }
           
           
           
            System.out.println("Enter firstname:");
            firstname = user_input.next();

            while (!Pattern.matches("[a-zA-z]+", firstname)) {
                System.out.println("Incorrect data. Input firstname again:");
                firstname = user_input.next();
            }

            System.out.println("Enter lastname:");
            lastname = user_input.next();

            while (!Pattern.matches("[a-zA-z]+", lastname)) {
                System.out.println("Incorrect data. Input lastname again:");
                lastname = user_input.next();
            }

            System.out.println("Enter Recent year:");
            int recent_year1 = user_input.nextInt();

            while (recent_year1 < 2016 || recent_year1 > 2016) {
                System.out.println("Incorrect data. Input Recent year again:");
                recent_year1 = user_input.nextInt();
            }

            System.out.println("Enter Years of person:");
            years_born = user_input.nextInt();

            while (years_born < 0 || years_born > 120) {
                System.out.println("Incorrect data. Input years of person again:");
                years_born = user_input.nextInt();
            }

            years = recent_year1 - years_born;

            System.out.println("Enter weight:");
            weight = user_input.nextDouble();

            while (weight < 0 || weight > 350) {
                System.out.println("Incorrect data. Input weight again:");
                weight = user_input.nextInt();
            }

            System.out.println("Enter height:");
            height = user_input.nextDouble();

            while (height < 0 || height > 230) {

                System.out.println("Incorrect data. Input height again:");
                height = user_input.nextDouble();
            }

            System.out.println("Enter profession:");
            profession = user_input.next();

            while (!Pattern.matches("[a-zA-z]+", profession)) {
                System.out.println("Incorrect data. Input Recent year again:");
                profession = user_input.next();

            }
            
            
System.out.println("How many grades would you like input?");
int numEntries = user_input.nextInt();

double sum = 0;
for (int q = 1; q <= numEntries; q++) {
    System.out.println("Please input number " + q + ": ");
    sum += user_input.nextDouble();
}
double avg = sum / numEntries;
        

            System.out.printf("%s %s is %s old. %s was born in %s. %s weight is %.2f and %s is %.2f cm tall. %s is a %s with an average grade of %.2f.", firstname, lastname, years_born, Pol2, years, Pol, weight,Pol1, height,Pol2, profession,avg);
            if (years_born < 18) {
                System.out.printf(" %s %s is under-age.", firstname, lastname);

            }

        }
        
          
        
        
            }
    }


