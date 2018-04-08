package com.company;

public abstract class Animal {
    protected String name;
    protected String type;
    protected boolean onDistance;
    protected float maxRunDistance;
    protected float maxSwimDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public void run(float dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " пробежал дистанцию.");
        } else {
            System.out.println(type + " " + name + " не пробежал дистанцию.");
            onDistance = false;
        }
    }
    public void swim(float dist) {
        if (maxSwimDistance <= 0.0f) {
            System.out.println(type + " " + name + " не умеет плавать.");
            onDistance = false;
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " проплыл дистанцию.");
        } else {
            System.out.println(type + " " + name + " не смог проплыть дистанцию.");
            onDistance = false;
        }
    }

    public abstract void jump(float height);

    public void showWin(){
        System.out.println(type+" "+ name+ " win.");
    }
}