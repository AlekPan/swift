/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleksandar
 */
public class task01Person {

    public static void main(String[] args) {

        task0Person nameObject = new task0Person();

        nameObject.saying();

        task0Person nameObject2 = new task0Person("Ime");
        nameObject2.setAge(-5);

        nameObject2.saying();

        task0Person nameObject3 = new task0Person("Tochko", 15);

        nameObject3.saying();

        task0Person nameObject4 = new task0Person();
        nameObject4.setAge(0);
        nameObject4.setName(null);
        nameObject4.saying();

        task0Person nameObject5 = new task0Person("Ime2");
        nameObject5.saying();

    }
}
