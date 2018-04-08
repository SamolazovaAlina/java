package com.company;

public class Plate {
    private  int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Food: "+ food);
    }
    public void takeoffFood(int amount){
        food-=amount;
    }
}
