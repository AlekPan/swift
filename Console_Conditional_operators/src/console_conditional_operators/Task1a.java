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
public class Task1a {
    public static void main(String[] args) { 
       
     Scanner sc = new Scanner(System.in);
     int n, purvochislo = 0;	 
     System.out.println("Number:");
     n = sc.nextInt();
     while( n != 0 )
     {
         n = n/10;
         if(n==0)
         {
        	break;
         }
         else
         {
        	 purvochislo = n;
                 
         }
     }
     	System.out.println(purvochislo);
 }
}
     
     








       
    






   
   
