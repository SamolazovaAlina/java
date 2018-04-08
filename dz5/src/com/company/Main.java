package com.company;
import org.omg.CORBA.Object;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Animal[] a = new Animal[3];

        a[0] = new Cat("Barsik");
        a[1]= new Dog("Bobik");
        a[2]= new Horse("Borka");

        for (int i = 0; i < a.length; i++) {
            a[i].run();
            a[i].swim();
            a[i].jump();
            System.out.println();
        }
    }
}
