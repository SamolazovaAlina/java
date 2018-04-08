package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	String[] names = {"Александр","Петр","Василий"};
        String[] surnames = {"Александров","Петров","Иванов"};
        String[] middlenames = {"Александрович","Петрович","Васильевич"};
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(surnames[rand.nextInt(surnames.length)] + " "+names[rand.nextInt(names.length)] +" "+ middlenames[rand.nextInt(middlenames.length)]);
        }
    }
}
