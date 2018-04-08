package com.company;

import java.util.Arrays;

public class Main {    //метод возвращающий массив

    public static void main(String[] args) {
        System.out.println(Arrays.toString(abc(5,8)));
    }
    public static int [] abc (int a,int b){
        return new int[]{a,b};
    }
}
