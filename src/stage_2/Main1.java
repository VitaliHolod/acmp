package stage_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) throws FileNotFoundException {

        run();
    }

    private static void run() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        int[] arr = readNumbs(sc);
        int[] p = new int[arr.length];
        int j = 0;

        prefixFunction(arr, p);
        printAnswer(arr, p);

    }

    private static void prefixFunction(int[] arr, int[] p) {
        int j;
        for (int i = 1; i < arr.length; ++i) {
            j = p[i - 1];
            while (j > 0 && (arr[j] != arr[i])) {
                j = p[j - 1];
            }
            if (arr[j] == arr[i]) {
                ++j;
            }
            p[i] = j;
        }
    }

    private static void printAnswer(int[] arr, int[] p) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.print(arr.length - p[arr.length - 1]);
        pw.flush();
    }

    private static int[] readNumbs(Scanner sc) {

        int sequenceLength = sc.nextInt();
        int[] numbs = new int[sequenceLength];
        for (int i = 0; i < sequenceLength; i++) {
            numbs[i] = sc.nextInt();

        }
        return numbs;
    }
}