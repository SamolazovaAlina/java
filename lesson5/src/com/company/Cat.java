package com.company;

public class Cat extends Animal {

    public Cat(String name, String color, int weight) {
        super(name,color,weight);
        type="Кот";

        //this.name = name;
        //this.color = color;
        //this.weight = weight;
    }
    public  Cat(){
        type="Cat";
        this.name = "Unknown";
        this.color = "Unknown";
        this.weight = 1;
    }
    @Override
    public void voice(){
        System.out.println(name+" : meeoow");
    }

    public void catJump() {
        System.out.println("CJ");
    }
}
