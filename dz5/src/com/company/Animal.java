package com.company;

public class Animal {
    protected String name;
    protected String type;

    public Animal(String name) {
        this.name = name;
    }
    public void run(){
        System.out.println(name+" run.");
    }
    public void swim(){
        System.out.println(name+" swim.");
    }
    public void jump(){
        System.out.println(name+" jump.");
    }
}
