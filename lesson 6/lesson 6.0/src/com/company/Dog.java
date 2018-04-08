package com.company;

public class Dog extends Animal {
    public Dog(String name){
        this.name=name;
        this.type="Dog";
        this.onDistance = true;
        this.maxRunDistance = 200.0f;
        this.maxSwimDistance = 20.0f;
    }

    @Override
    public void jump(float height) {
        if(height<=0.5f){
            System.out.println(type+" "+ name+" перепрыгнул препятствие");
        }else {
            System.out.println(type+" "+ name+" не смог перепрыгнуть препятствие");
            onDistance = false;
        }
    }
}
