package com.company;

import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String a = "Hello World";
        byte[] wASCII, wUTF8, wUTF16;
        try {
            wASCII = a.getBytes("US-ASCII");
            wUTF8 = a.getBytes("UTF-8");
            wUTF16 = a.getBytes("UTF-16");
            System.out.println(Arrays.toString(wASCII));
            System.out.println(Arrays.toString(wUTF8));
            System.out.println(Arrays.toString(wUTF16));


        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
    }

