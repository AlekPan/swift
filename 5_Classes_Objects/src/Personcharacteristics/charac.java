/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personcharacteristics;

import java.util.Scanner;

/**
 *
 * @author Aleksandar
 */
public class charac {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String firstname;
        String lastname;
        int years_born = 0;
        int years;
        double weight;
        double height;
        String profession;
        String gender;
        int recent_year1 = 2016;
        double avg;
        double avg1 = 0;
        double avg2 = 0;
        double avg3 = 0;

        
        
        
        
        years = recent_year1 - years_born;
        avg = (avg1 * avg2 * avg3) / 3;

        characteristic nameObject3 = new characteristic("Peshp", "test", "f", 1968, 152, 144, "troll", 4, 5, 6);
        nameObject3.saying();
        System.out.println();
        characteristic nameObject2 = new characteristic("Peshp", "test", "m", 1968, 152, 144, "troll", 4, 5, 6);
        nameObject2.saying();
        System.out.println();
        characteristic nameObject1 = new characteristic("Peshp", "test", "f", 2013, 152, 144, "troll", 3.22, 5, 6);
        nameObject1.saying();

    }

}
