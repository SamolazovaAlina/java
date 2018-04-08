package com.company;

public class Animal {
    protected String name;
    protected String color;
    protected int weight;
    protected String type;

    public Animal(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void info(){
        System.out.println("name: "+name+" color: "+ color+" weight: "+weight);
    }

    public Animal(){

    }

    public void jump(){
        System.out.println(type+" "+name+" прыгнул.");
    }
    public void voice(){
        System.out.println(name+" :voice .");
    }
}
