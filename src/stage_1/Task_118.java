package ru.acmp;

import java.util.Scanner;

public class Task_118 {

    static int positionFlavia(int n, int k) {
        int position = 0;
        for (int i = 0; i < n; ++i) {
            position = (position + k) % (i + 1);
        }
        return position + 1;
    }

    public static void main(String[] argv) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(positionFlavia(n, k));
    }
}


