package com.company;

import java.util.Arrays;
public class Mains{
    public static void main(String[] args){
        int[] b =new int[8];
        b[0]=1;
        for( int i=1;i<b.length;i++){
            b[i]=b[i-1]+3;
            }
    System.out.println(Arrays.toString(b));
    }
}