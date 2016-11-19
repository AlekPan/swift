
package PersonCharacteristics;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aleksandar
 */
public class PersonCharacteristics2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Scanner user_input = new Scanner(System.in);
        
        
        String firstname = "";
        double height = 0;
        String profession = "";
        String lastname="";
        double weight = 0;
        int n = 0;
        int years_born = 0;
        
        int chisla = user_input.nextInt();
        for (int i = 1; i <= chisla; i++) {
       
        System.out.println("Enter firstname:" );
        firstname = user_input.next();
        
 while (!Pattern.matches("[a-zA-z]+", firstname)) {
            System.out.println("Incorrect data. Input firstname again:");
            firstname = user_input.next();
         }
        
        
        
        System.out.println("Enter lastname:" );
        lastname = user_input.next();
        
        while (!Pattern.matches("[a-zA-z]+", lastname)) {
            System.out.println("Incorrect data. Input lastname again:");
            firstname = user_input.next();
         }
        
        
        int recent_year1; 
        System.out.println("Enter Recent year:" );
        recent_year1 = user_input.nextInt();
        
        while ( recent_year1 < 2016 || recent_year1 > 2016 ) {
            System.out.println("Incorrect data. Input Recent year again:");
            recent_year1 = user_input.nextInt();
        }
        
       
        System.out.println("Enter Years of person:" );
        years_born = user_input.nextInt();
        
        while ( years_born < 0 || years_born > 120 ) {
            System.out.println("Incorrect data. Input years of person again:");
            recent_year1 = user_input.nextInt();
        }
        
        
       
       
        
        
        System.out.println("Enter weight:" );
        weight = user_input.nextDouble();
        
         while ( weight < 0 || weight > 350 ) {
            System.out.println("Incorrect data. Input weight again:");
            weight = user_input.nextInt();
        }
        
        
        System.out.println("Enter height:" );
        height = user_input.nextDouble();
        
         while ( height < 0 || height > 230 ) {
            System.out.println("Incorrect data. Input height again:");
            height = user_input.nextInt();
        }
        
         int years = recent_year1 - years_born; 
        
        System.out.println("Enter profession:" );
        profession = user_input.next();
        
        while (!Pattern.matches("[a-zA-z]+", firstname)) {
            System.out.println("Incorrect data. Input Recent year again:");
            firstname = user_input.next();
         }
        
       years = n;
       
        }
        int years = n;
        
    System.out.print(firstname + " " + lastname + " is " + years_born +" old. He was born in "+ years + ". His weight is " + weight + " and he is " + height + "cm tall. He is a " + profession + "." );
    if ( years_born < 18 ) {
            System.out.print(" " + firstname + " " + lastname + " is underaged. "); 
        }
       
    
}

}