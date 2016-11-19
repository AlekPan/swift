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
public class task1b {
     public static void main(String[] args) { 
         Scanner sc = new Scanner(System.in);
         int n;
         int reverse = 0;
         n = sc.nextInt();
         
     while( n != 0 )
     {
         
         reverse = reverse*10;
         reverse = reverse + n%10;
         n=n/10;
         
         
         }
      System.out.println("Reverse:"+reverse);
     }
}
     

