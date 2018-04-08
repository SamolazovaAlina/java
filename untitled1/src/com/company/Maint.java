package com.company;


public class Maint {
    public static void main(String[] args){
        int[] mas ={1, 5, 3, 2, 11, 4};
        int max = mas[0];
        int min = mas[0];
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] > max)
                max = mas[i];

            if(mas[i] < min)
                min = mas[i];
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }
}

