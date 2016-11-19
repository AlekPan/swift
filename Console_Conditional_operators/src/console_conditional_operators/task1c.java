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
public class task1c {
    public static void main(String[] args) { 
       
     Scanner sc = new Scanner(System.in);
     int n;	 
     int sbor2 = 0;
     
     int x = 0;
     System.out.println("Number:");
     n = sc.nextInt();
     while( n != 0 )
     {
       sbor2 = sbor2 + n%10;
        
         n = n/10;
         
     }
     	System.out.println("sbora =" + sbor2 );
 }
}
