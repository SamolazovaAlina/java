package com.company;

public class Cat {
    private String name;
    private  boolean hungry;

    public Cat(String name) {
        this.name = name;
        hungry = true;
    }
    public void info(){
        System.out.println(name+" : "+hungry);
    }

    public void eat(Plate pl){
        pl.takeoffFood(10);
        hungry = false;
    }
}
