package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main1 {
    public static void main (String args[]) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream("1.txt");
            fout = new FileOutputStream("rez.txt");
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
            fin.close();
            fin = new FileInputStream("2.txt");
            do{
                i = fin.read();
                if(i!=-1) fout.write(i);
            }  while (i!=-1);
            if (fin != null) fin.close();
            if (fout != null) fout.close();
        } catch (Exception е) {
            System.out.println("Произошла ошибка при работе с файлами");
        }
    }
    }
