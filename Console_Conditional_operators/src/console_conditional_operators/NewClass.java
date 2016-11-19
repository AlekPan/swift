/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console_conditional_operators;

import java.util.Scanner;

/**
 *
 * @author Aleksandar
 */
public class NewClass {
                public static void main(String[] args) {
 
 Scanner sc = new Scanner(System.in);
      int chisla =  sc.nextInt();
      int a = 0;
        int b[] = new int[chisla];
        
        for (int i = 1; i <= chisla; i++) {
            b[i] = sc.nextInt();
    System.out.println(b[i]);   
    a=i;
      }
                    
    
      System.out.println(b[a]);
   }
}