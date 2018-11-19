package ru.acmp;

import java.io.*;
import java.util.Scanner;

public class Task_557 {

    private int quantityArrays;
    private int sizeArray;
    private int elementRow;
    private int elementColumn;
    private int p;
    private int[] elLine;

    private Task_557() throws IOException {
        readNumbs();
    }

    public static void main(String[] args) throws IOException {

        new Task_557();
    }

    private void readNumbs() throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        int[] metainf = new int[4];
        for (int i = 0, k = 0; i < 2; i++) {
            String[] tempMeta = sc.nextLine().split(" ");
            for (int j = 0; j < 2; j++) {
                metainf[k++] = Integer.valueOf(tempMeta[j]);
            }
        }
        quantityArrays = metainf[0];
        sizeArray = metainf[1];
        elementRow = metainf[2] - 1;
        elementColumn = metainf[3] - 1;
        p = Integer.valueOf(sc.nextLine());
        run(sc);
        sc.close();
    }

    private void run(Scanner sc) throws IOException {
        elLine = new int[sizeArray];
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
        for (int i = 0; i < sizeArray; i++) {
            if (i == elementRow) {
                String[] temp = sc.nextLine().split(" ");
                for (int j = 0; j < sizeArray; j++) {
                    elLine[j] = Integer.valueOf(temp[j]);
                }
                continue;
            }
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
        }
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
        for (int n = 1; n < quantityArrays; n++) {
            int[] sum = new int[sizeArray];
            for (int i = 0; i < sizeArray; i++) {
                String[] temp = sc.nextLine().split(" ");
                for (int j = 0; j < sizeArray; j++) {
                    sum[j] += Integer.valueOf(temp[j]) * elLine[i];
                    if (i == sizeArray - 1 && sum[j] >= p) {
                        sum[j] %= p;
                    }
                }
            }
            elLine = sum;
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
        }
        printAnswer();
    }

    private void printAnswer() throws IOException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.write(elLine[elementColumn] + "");
        pw.close();
    }
}