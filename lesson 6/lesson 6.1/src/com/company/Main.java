package com.company;

public class Main {

    public static void main(String[] args) {
         Cat c1 = new Cat("Barsik");
        Cat c2 = new Cat("Barsik2");
        Cat c3 = new Cat("Barsik3");
         Plate p = new Plate(100);
        Plate p2 = new Plate(100);


         p.info();
        p2.info();
        c1.eat(p);
        c2.eat(p);
        c3.eat(p2);
         p.info();
         p2.info();
    }
}
