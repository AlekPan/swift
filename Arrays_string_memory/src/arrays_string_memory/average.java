/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_string_memory;

import java.util.Scanner;

/**
 *
 * @author Aleksandar
 */
public class average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

System.out.println("How many entries would you like input?");
int numEntries = scanner.nextInt();

double sum = 0;
for (int i = 1; i <= numEntries; i++) {
    System.out.println("Please input number " + i + ": ");
    sum += scanner.nextDouble();
}
double f = sum / numEntries;
    }
}