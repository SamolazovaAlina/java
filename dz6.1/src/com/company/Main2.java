package com.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
         find();
         long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
    public static void find(){
        String a = "imported";

         byte[] b = a.getBytes();
        System.out.println(Arrays.toString(b));
        int c = 0;
        int pointer = 0;
        try{
            BufferedInputStream reader = new BufferedInputStream(new FileInputStream("lotr.txt"));
            //FileInputStream reader = new FileInputStream("lotr.txt");
            int x;
            do{
                pointer++;
                x = reader.read();
                if(b[c] == x){
                    c++;
                    if (c == b.length){
                        System.out.println("Win at "+ (pointer - c));
                        break;
                    }
                }else c=0;
            }while (x!=-1);
            reader.close();
        }catch (Exception e){
            e.printStackTrace();}
        }
    }
