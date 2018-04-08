package com.company;

import java.util.Arrays;

public class Mainy {
    public static void main(String[] args) {
        String a = "hello world";
        String key = "key";

        byte [] w=a.getBytes();
        for (int i = 0; i < w.length; i++) {
            w[i]+=1;
        }
        String b = new String(w);
        System.out.println(a);
        System.out.println(b);
        //System.out.println(Arrays.toString(w));
    }
}
