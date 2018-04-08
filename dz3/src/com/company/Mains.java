package com.company;

import java.util.Random;
import java.util.Scanner;

public class Mains {
    public static char[][] field = new char[3][3];
    public static Scanner sc;
    public static Random rand;
    public static final int FIELD_SIZE = 5;
    public static final int DOTS_TO_WIN = 3;


    public static void main(String[] args) {
        sc = new Scanner(System.in);
        rand = new Random();
        initField();
        showField();
        while (true) {
            humanStep();
            showField();
            if (checkWin('X')) {
                System.out.println("Human Win");
                break;
            }
            if (isFieldFull()) break;

            AIStep();
            showField();
            if (checkWin('O')) {
                System.out.println("AI Win");
                break;
            }
            if (isFieldFull()) break;

        }
        System.out.println("Game Over");
    }

    public static boolean checkWin(char ox) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (checkLine(i, j, 1, 0, ox, DOTS_TO_WIN)) return true;
                if (checkLine(i, j, 0, 1, ox, DOTS_TO_WIN)) return true;
                if (checkLine(i, j, 1, 1, ox, DOTS_TO_WIN)) return true;
                if (checkLine(i, j, 1, -1, ox, DOTS_TO_WIN)) return true;
            }

        }
        return false;
    }

    public static boolean checkLine(int sx, int sy, int vx, int vy, char ox, int l) {
        if (sx + l * vx > FIELD_SIZE || sy + l * vy > FIELD_SIZE || sy + l * vy < -1) return false;
        for (int i = 0; i < l; i++) {
            if (field[sy + vy * i][sx + vx * i] != ox) return false;
        }
        return true;
    }

    public static boolean isFieldFull() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (field[i][j] == '.') return false;
            }
        }
        return true;
    }

    public static void initField() {
        field = new char[FIELD_SIZE][FIELD_SIZE];
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                field[i][j] = '.';
            }
        }
    }

    public static void showField() {
        for (int i = 0; i <= FIELD_SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellEmpty(int x, int y) {
        if (x < 0 || x > FIELD_SIZE - 1 || y < 0 || y > FIELD_SIZE - 1)
            return false;
        if (field[y][x] != '.')
            return false;
        return true;
    }

    public static void humanStep() {
        System.out.println("Введите координаты X Y");
        int x, y;
        do {
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        field[y][x] = 'X';
    }

    public static void AIStep() {
        int x = -1, y = -1;
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (isCellEmpty(j, i)) {
                    field[i][j] = 'O';
                    if (checkWin('O')) {
                        x = j;
                        y = i;
                    }
                    field[i][j] = '.';
                }
            }
        }
        if (x == -1 && y == -1) {
            for (int i = 0; i < FIELD_SIZE; i++) {
                for (int j = 0; j < FIELD_SIZE; j++) {
                    if (isCellEmpty(j, i)) {
                        field[i][j] = 'X';
                        if (checkWin('X')) {
                            x = j;
                            y = i;
                        }
                        field[i][j] = '.';
                    }
                }
            }
        }
        if (x == -1 && y == -1) {
            do {
                x = rand.nextInt(FIELD_SIZE);
                y = rand.nextInt(FIELD_SIZE);
            } while (!isCellEmpty(x, y));
        }
        field[y][x] = 'O';
    }
}