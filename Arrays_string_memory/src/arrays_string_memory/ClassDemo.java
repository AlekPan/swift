/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_string_memory;

import java.lang.reflect.Field;

 

public class ClassDemo {

   public static void main(String[] args) {
 
     ClassDemo c = new ClassDemo();
     Class cls = c.getClass();
        
     System.out.println("Field =");

     try {
        // string field
        Field sField = cls.getField("string1");
        System.out.println("Public field found: " + sField.toString());
     }
     catch(NoSuchFieldException e) {
        System.out.println(e.toString());
     }
   }
   
   public ClassDemo() {
      // no argument constructor
   }

   public ClassDemo(String string1) {       
      this.string1 = string1;
   }
    
   public String string1 = "tutorialspoint";
} 