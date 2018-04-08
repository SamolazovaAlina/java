package com.company;

import java.util.Scanner;
public class Mainy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        float a = sc.nextFloat();
        System.out.println("Введите второе целое число:");
        float b = sc.nextFloat();
        System.out.println("Выберите действие:");
        System.out.println("1.Сложить");
        System.out.println("2.Отнять");
        System.out.println("3.Умножить");
        System.out.println("4.Разделить");
        Scanner scy = new Scanner(System.in);
        float c = scy.nextFloat();
        if (c==1){ System.out.println("Результат:"+(a+b));
        }
        else if (c==2) {
            System.out.println("Результат:"+(a-b));
        }
        else if (c==3) {
            System.out.println("Результат:"+(a*b));
        }
        else
            System.out.println("Результат:"+(a/b));
    }
}
