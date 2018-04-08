package com.company;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
        this.type = "Cat";
        this.onDistance = true;
        this.maxRunDistance = 100.0f;
        this.maxSwimDistance = 0.0f;

    }

    @Override
    public void jump(float height) {
        if (height <= 2.0f) {
            System.out.println(type + " " + name + " перепрыгнул препятствие.");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть препятствие.");
            onDistance = false;
        }
    }
    }

