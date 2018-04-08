package com.company;

public class Work {
    private String name;
    private String position;
    private String email;
    private String tell;
    private int salary;
    private int age;

    public Work(String name, String position, String email, String tell, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tell = tell;
        this.salary = salary;
        this.age = age;
    }

    public void read() {
        System.out.println("ФИО: "+ name +" Должность: "+position+" email: "+email+" телефон: "+ tell+" заработная плата: "+salary);
    }

    public int getAge() {
        return age;
    }
}
