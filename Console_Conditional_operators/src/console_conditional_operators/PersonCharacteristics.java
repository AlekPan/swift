package console_conditional_operators;

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

            System.out.printf("%s %s is %s old. He was born in %s . His weight is %.2f and he is %.2f cm tall. He is a %s.", firstname, lastname, years_born, years, weight, height, profession);
            if (years_born < 18) {
                System.out.printf(" %s %s is under-age.", firstname, lastname);
System.out.println();
            }

        }
        
        
         System.out.printf("%s %s is %s old. He was born in %s . His weight is %.2f and he is %.2f cm tall. He is a %s.", firstname, lastname, years_born, years, weight, height, profession);
            if (years_born < 18) {
                System.out.printf(" %s %s is under-age.", firstname, lastname);
            }
    }
}
