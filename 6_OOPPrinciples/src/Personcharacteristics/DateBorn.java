
import Personcharacteristics.characteristic;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

 public class DateBorn extends characteristic {
    public static void main(String args[])
   {
   
            }

    public DateBorn(String firstnameVar, String lastnameVar, String genderVar, double heightVar, Date_born) {
        super(firstnameVar, lastnameVar, genderVar, heightVar);
        
                 String Date_born = "";
        
       DateFormat df = new SimpleDateFormat("d.M.yyyy");
    
       try
       {
           //format() method Formats a Date into a date/time string. 
           Date d1 = df.parse(Date_born);
           System.out.println("Date in dd/MM/yyyy format is: "+ df.format(d1));

       }
       catch (Exception ex ){
          System.out.println(ex);
    }
}
 }