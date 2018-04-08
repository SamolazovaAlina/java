package com.company;
import java.util.Random;
import java.util.Scanner;
public class Mains {
    public static char[][] map;
    public static Scanner sc;
    public static Random rand;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        rand = new Random();
        initMap();
        showMap();
        while (true) {
            humanTurn();
            showMap();

            if (checkWin('X')){
                System.out.println("Human Win");
                break;
            }
            if (isMapFull()) break;

            aiTurn();
            showMap();
            if (checkWin('O')){
                System.out.println("AI Win");
                break;
            }
            if (isMapFull()) break;
        }
        System.out.println("Game Over");
    }

    public static boolean checkWin(char ox) {
        if (map[0][0] ==ox && map[1][0] ==ox && map[2][0] ==ox ) return true;
        if (map[0][1] ==ox && map[1][1] ==ox && map[2][1] ==ox ) return true;
        if (map[0][2] ==ox && map[1][2] ==ox && map[2][2] ==ox ) return true;

        if (map[0][0] ==ox && map[0][1] ==ox && map[0][2] ==ox ) return true;
        if (map[1][0] ==ox && map[1][1] ==ox && map[1][2] ==ox ) return true;
        if (map[2][0] ==ox && map[2][1] ==ox && map[2][2] ==ox ) return true;

        if (map[0][0] ==ox && map[1][1] ==ox && map[2][2] ==ox ) return true;
        if (map[2][0] ==ox && map[1][1] ==ox && map[0][2] ==ox ) return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
               if (map[i][j]=='•') return false;
            }
        }
        return true;
    }

    public static void initMap(){
        map=new char [3][3];
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j]='•';
            }
            }
            
        }

    public static void showMap() {
        System.out.println("0 1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1)+" ");
            for (int j = 0; j <3 ; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellEmpty(int x,int y) {
        if (x<0 || x>2 || y<0 ||y>2)
            return false;
        if(map[y][x] !='•')
        return false;
        return true;

    }
    public static void humanTurn() {
        System.out.println("Введите координаты X Y");
        int x,y;
        do {
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellEmpty(x,y));
        map[y][x]='X';
    }
    public static void aiTurn() {

        int x,y;
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!isCellEmpty(x,y));
        map[y][x]='O';
    }
    }

