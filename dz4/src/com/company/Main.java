package com.company;

public class Main {

    public static void main(String[] args) {
     Work[] p = new Work[5];
     p[0]= new Work("Petrov Petr","Engineer","petrov@gmail.com","375234567456",550,39);
        p[1]= new Work("Ivanov Ivan","Administrator","ivanov@gmail.com","375232137456",850,35);
        p[2]= new Work("Smitt Bob","Seller","smitt@gmail.com","375234567856",450,25);
        p[3]= new Work("Pere Tom","manager","pere@gmail.com","375234569876",950,45);
        p[4]= new Work("Potter Kevin","Seller","potter@gmail.com","375249767456",350,28);
        p[1].read();
        for (int i = 0; i < p.length; i++) {
            if(p[i].getAge()>= 40) p[i].read();
        }

    }
}
