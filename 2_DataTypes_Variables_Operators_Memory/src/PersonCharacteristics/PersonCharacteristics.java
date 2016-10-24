
package PersonCharacteristics;
import java.util.Scanner;
/**
 *
 * @author Aleksandar
 */
public class PersonCharacteristics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String first_name = "Georgi";
        String last_name = "Georgiev";
        int year = 2002;
        int recent_year = 2016;
        int birth_year = recent_year - year;
        int height1 = 156;
        float weight1 = 48.3f;
        String profession1 = "Programmer";
        System.out.println(first_name + " " + last_name + " is " + birth_year + ". His weight is " + weight1 + "and he is " + height1 + "cm tall. He is a " + profession1 + "." );
    
        
        Scanner user_input = new Scanner(System.in);
        
        String firstname; 
        System.out.println("Enter firstname:" );
        firstname = user_input.next();
        
        String lastname; 
        System.out.println("Enter lastname:" );
        lastname = user_input.next();
        
        int years_born; 
        System.out.println("Enter years_born:" );
        years_born = user_input.nextInt();
        
        int recent_year1; 
        System.out.println("Enter years_recent:" );
        recent_year1 = user_input.nextInt();
        
        int years = recent_year1 - years_born; 
       
        
        String weight; 
        System.out.println("Enter weight:" );
        weight = user_input.next();
        
        String height; 
        System.out.println("Enter height:" );
        height = user_input.next();
        
        String profession; 
        System.out.println("Enter profession:" );
        profession = user_input.next();
      
       System.out.println(firstname + " " + lastname + " is " + years + ". His weight is " + weight + "and he is " + height + "cm tall. He is a " + profession + "." );
    }
    
}

