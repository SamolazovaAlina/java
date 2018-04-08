package com.company;

public class Main {

    public static void main(String[] args) {
        Cat c1 = new Cat("Barsik");
        Plate p =  new Plate(100);

        p.info();
        c1.info();
        c1.eat(p);
        p.info();
        c1.info();
    }
}
