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
public class task2a {
    
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int chisla = input.nextInt();
		int a = 0;
		int sum = 0;
		for (int i = 1; i <= chisla; i++) {
			a = input.nextInt();
			sum += a;
		}
		System.out.println(sum);
	}
}

