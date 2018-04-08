package com.company;

public class Cat {
    private String name;
    private String color;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            System.out.println("возраст кота заменен с "+ this.age + " на "+ age);
            this.age = age;
        } else {
            System.out.println("неверно указан возраст кота");
        }
    }
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.println("name: "+name + " color: "+ color+ " age: "+age);
    }

    public void meow() {
        System.out.println(name+": meeeaaawwwoooo!!!");
    }
}
