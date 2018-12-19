import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_233 {
    public static void main(String[] argv) throws IOException {
        new Main().run();
    }

    public void run() throws IOException {

        int height = 437;
        int arr[] = numbs();
        String s = "No crash";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= height) {
                s = "Crash " + (i + 1);
                break;
            }
        }

        printAnswer(s);
    }

    private static int[] numbs() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void printAnswer(String count) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.print(count);
        pw.close();
    }
}