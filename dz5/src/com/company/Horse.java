package com.company;

public class Horse extends Animal {
    public Horse(String name) {
        super(name);
        type = "Horse";
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
    System.out.println(name+" jump on 2 m.");
}
}
