/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwapVariables;

/**
 *
 * @author Aleksandar
 */
public class SwapVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int x = 11, y = 7;
         int temp = x; 
         x=y;
         y=temp;
                
      int z = 5, t = 9;
      int temp1 = z; 
         z=t;
         t=temp1;
      
    
     
      System.out.println("x=" + x);  
System.out.println("y=" +y);
   System.out.println("t=" + t);  
System.out.println("z=" + z);
 

    }
  //  0000 0011
   // 0000 0100
}
