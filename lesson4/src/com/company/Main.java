package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 20;
        Integer b = 20; //класс для int(обертка)

        Cat[] c = new Cat[5];
        c[0] = new Cat ("Barsik","White",3);
        c[0].info();




     Cat c1= new Cat("Barsik","White", 2);
     Cat c2 = new Cat("Murzik","Brown", 5);

     c1.info();
     c2.info();

     c1.meow();
     c2.meow();
     c1.setName("Bob");
        System.out.println(c1.getName());
        c1.setAge(101);

        c1.setColor("Black");
        c2=c1;
        c2.setColor("Purple");
        System.out.println(c1.getColor());
        System.out.println(c2.getColor());
    }
}
