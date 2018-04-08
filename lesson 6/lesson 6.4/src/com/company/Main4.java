package com.company;

import java.io.FileInputStream;

public class Main4 {
    public static void main(String[] args) {


        try {
            FileInputStream fin = new FileInputStream("out.txt");
            int a = fin.read();
            System.out.print((char)a);
            while (a!=-1){
                a = fin.read();
                System.out.print((char)a);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
