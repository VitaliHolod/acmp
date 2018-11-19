package ru.acmp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_579 {
    public static void main(String[] args) throws IOException {
        Task_579.run();
    }

    private static void run() throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        int[] numbs = readNumbs(sc);

        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] > 0) {
                countPositive += numbs[i];
                positiveNumbers.add(i);
            } else if (numbs[i] < 0) {
                countNegative += Math.abs(numbs[i]);
                negativeNumbers.add(i);
            }
        }

        printAnswer(positiveNumbers, negativeNumbers, countPositive, countNegative);
    }

    private static void printAnswer(List<Integer> positiveNumbers, List<Integer> negativeNumbers, int countPositive, int countNegative) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        if (countPositive > countNegative) {
            pw.print(positiveNumbers.size());
            pw.println();
            for (int s : positiveNumbers) {
                pw.print(s + 1 + " ");
            }
        } else {
            pw.print(negativeNumbers.size());
            pw.println();
            for (int s : negativeNumbers) {
                pw.print(s + 1 + " ");
            }
        }
        pw.close();
    }

    private static int[] readNumbs(Scanner sc) {
        sc.useDelimiter(System.getProperty("line.separator"));
        int sequenceLength = sc.nextInt();
        String readNumbs = sc.next();

        String[] str = readNumbs.split(" ");
        int[] numbs = new int[sequenceLength];
        for (int i = 0; i < sequenceLength; i++) {
            numbs[i] = Integer.parseInt(str[i]);
        }
        return numbs;
    }
}
