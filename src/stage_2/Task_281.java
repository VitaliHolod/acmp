package stage_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_281 {
    public static void main(String[] argv) throws IOException {
        new Task_281().run();
    }

    public void run() throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));

        int n = sc.nextInt();
        int m = sc.nextInt();
        final int SIZE = 21;

        int arr[][] = new int[SIZE][SIZE];

        for (int i = 0; i < n + 1; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }

        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        int count = 0;
        for (int i = m; i < n + 1; i++) {
            count += arr[n][i];
        }

        printAnswer(count);
    }

    private static void printAnswer( int count) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.print(count);
        pw.close();
    }
}
