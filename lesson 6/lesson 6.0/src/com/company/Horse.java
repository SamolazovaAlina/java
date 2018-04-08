package com.company;

public class Horse extends Animal {
    public Horse(String name){
        this.name=name;
        this.type="Horse";
        this.onDistance = true;
        this.maxRunDistance = 1000.0f;
        this.maxSwimDistance = 10.0f;
    }

    @Override
    public void jump(float height) {
        if(height<=1.0f){
            System.out.println(type+" "+ name+" перепрыгнул препятствие");
        }else {
            System.out.println(type+" "+ name+" не смог перепрыгнуть препятствие");
            onDistance = false;
        }
    }
}
