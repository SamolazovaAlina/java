package com.company;

public class Dog extends Animal {

    public Dog(String name, String color, int weight) {
        super(name,color,weight);
        type="Пес";
        //this.name = name;
        //this.color = color;
        //this.weight = weight;
    }
    @Override
    public void voice(){
        System.out.println(name+" : gaaavgaav");
    }

    @Override
    public String toString() {
        return "Dog "+ name;
    }
}

