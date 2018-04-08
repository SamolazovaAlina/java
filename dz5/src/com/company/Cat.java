package com.company;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        type = "Cat";
    }
    @Override
    public void run(){
        System.out.println(name+" run.");
    }
    @Override
    public void swim(){
        System.out.println(name+" not swim.");
    }
    @Override
    public void jump(){
        System.out.println(name+" jump on 1 m.");
    }
}