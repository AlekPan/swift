/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Aleksandar
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int time = 1234567;
          int days = time / 86400;
          int hours = (time-(days*86400))/3600;
          int minutes = (time-(days*86400) - (hours*3600))/60;
          int seconds = (time-(days*86400) - (hours*3600) - (minutes*60));
          System.out.println(seconds);
          System.out.println(days*86400);
          System.out.println(hours*86400);
          System.out.println(days+" days "+ hours + " hours " + minutes + " minutes " + seconds + " seconds" );
    }
    
}
