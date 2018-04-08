package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
public static char[][] field=new char[3][3];
public static Scanner sc;
public static Random rand;

    public static void main(String[] args) {
        sc=new Scanner(System.in);
        rand= new Random();
	initField();
	printField();
while (true) {
    humanStep();
    printField();
    if (checkWin('X')){
        System.out.println("Human Win");
        break;
    }
    if (isFieldFull()) break;

    AIStep();
    printField();
    if (checkWin('O')){
        System.out.println("AI Win");
        break;
    }
    if (isFieldFull()) break;
}
        System.out.println("Game Over");
    }

    public static boolean checkWin(char ox) {
        if ( field[0][0]==ox && field[1][0]==ox && field[2][0]==ox) return true;
        if ( field[0][1]==ox && field[1][1]==ox && field[2][1]==ox) return true;
        if ( field[0][2]==ox && field[1][2]==ox && field[2][2]==ox) return true;

        if ( field[0][0]==ox && field[0][1]==ox && field[0][2]==ox) return true;
        if ( field[1][0]==ox && field[1][1]==ox && field[1][2]==ox) return true;
        if ( field[2][0]==ox && field[2][1]==ox && field[2][2]==ox) return true;

        if ( field[0][0]==ox && field[1][1]==ox && field[2][2]==ox) return true;
        if ( field[2][0]==ox && field[1][1]==ox && field[0][2]==ox) return true;
        return false;
    }

    public static boolean isFieldFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              if (field[i][j]=='.')
                  return false;
            }
        }
        return true;
    }

    public static void initField() {
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                field[i][j]='.';
            }
        }
    }

    public static void printField() {
        System.out.println("0 1 2 3");
        for (int i = 0; i <3 ; i++) {
            System.out.print((i+1)+" ");
            for (int j = 0; j <3 ; j++) {
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellEmpty(int x, int y) {
      if (x<0 || x>2 || y<0 || y>2 )
         return false;
      if (field[y][x] !='.')
          return false;
      return true;
    }

    public static void humanStep() {
        System.out.println("Введите координаты X Y");
        int x,y;
        do {
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }while (! isCellEmpty(x,y));
        field[y][x]='X';
    }
    public static void AIStep() {

        int x,y;
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        }while (! isCellEmpty(x,y));
        field[y][x]='O';
    }
}
