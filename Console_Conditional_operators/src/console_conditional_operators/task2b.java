/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console_conditional_operators;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Aleksandar
 */
public class task2b {
    
	public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int reverse = 0 ;
         String reversedNumbers ="";
         int chisla = sc.nextInt();
         for (int i = 1; i <= chisla; i++) {
             int n = sc.nextInt();
             reversedNumbers+=n+" ";
     while( n != 0 )
     {
        
         reverse = reverse*10 ;
         reverse = reverse + n%10;
         n=n/10;
         }
     }
        
     System.out.println(new StringBuilder(reversedNumbers));  
}
}

