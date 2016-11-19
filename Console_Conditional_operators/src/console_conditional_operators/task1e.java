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
public class task1e {
     public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
     
      
     
     
     int n = sc.nextInt();
     if( n==1){
         System.out.print(false);
          
     }
     if( n==2){
         System.out.print(true);
          
     }
     for(int i=2; i<n; i++){
         
         
     
         
     if( n%1==0 & n%n==0 && n%i!=0) 
     {
                 System.out.print(true);
                 break;
     }
     
     
     
     
     if(  n%1==0 & n%n == 0 && n%i==0){
         System.out.print(false);
break;
     }
        break;
             
         }
                 }
     
     }


