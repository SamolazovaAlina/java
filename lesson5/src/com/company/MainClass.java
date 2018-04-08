package com.company;

import org.omg.CORBA.Object;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        /*Object[] objs = new Object[10];
        objs[0] = new Random();
        objs[1] = new Scanner(System.in);
        objs[2] = new Cat("a","c",2);*/

        Animal[] a = new Animal[2];

        a[0] = new Cat("Barsik","White",2);
        a[1]= new Dog("Bobik","Black",5);

        for (int i = 0; i < a.length; i++) {
            a[i].voice();
        }
        /*if (a[0] instanceof Cat)
        ((Cat)a[0]).catJump();

        System.out.println(a[1].toString());*/

    /*Cat c1 = new Cat("Barsik","White",2);
    c1.info();
    Dog d1 = new Dog("Bobik","Black",5);
    d1.info();
    c1.voice();
    d1.voice();

    c1.jump();
    d1.jump();*/

    }
}
