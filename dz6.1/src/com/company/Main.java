package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try{ PrintWriter pw = new PrintWriter(new FileWriter("1.txt"));
            pw.println("Our Earth is so beautiful. There, are a lot of blue rivers and lakes on the Earth. Its oceans are full of wonders. There are high mountains covered with snow and wonderful fields and forests full of different plants and animals. ");
            pw.flush();
            pw.close();
            PrintWriter pl = new PrintWriter(new FileWriter("2.txt"));
            pl.println("The sun shines high up in the blue sky. At night we can see the moon and millions of stars. One season comes after another and brings changes in weather and nature. ");
            pl.flush();
            pl.close();


        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
