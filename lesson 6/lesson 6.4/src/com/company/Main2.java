package com.company;

import java.io.FileOutputStream;

public class Main2 {
    public static void main(String[] args) {
        String a = "Hello World";
        byte[] w = a.getBytes();
        try {
            FileOutputStream fout = new FileOutputStream("out.txt");
            fout.write(w);
            fout.close();


        }catch (Exception e){
            System.out.println("error");
        }
    }
}