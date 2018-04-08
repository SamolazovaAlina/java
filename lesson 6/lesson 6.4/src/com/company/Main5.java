package com.company;

import java.io.*;

public class Main5 {
    public static void main(String[] args) {
        try{ PrintWriter pw = new PrintWriter(new FileWriter("1.txt"));
            for (int i = 0; i < 10; i++) {
                pw.println("Hello World"+i);
            }
            pw.flush();
            pw.close();
            BufferedReader br = new BufferedReader(new FileReader("1.txt"));
            String s = "";
            do{
                s = br.readLine();
                System.out.println(s);
            }while (s!=null);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
