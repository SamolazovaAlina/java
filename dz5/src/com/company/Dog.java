package com.company;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
        type = "Dog";
    }
    @Override
    public void run(){
        System.out.println(name+" run.");
    }
    @Override
    public void swim(){
        System.out.println(name+" swim.");
    }
    @Override
    public void jump(){
        System.out.println(name+" jump on 0,5 m.");
    }
}
