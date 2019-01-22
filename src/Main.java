import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] argv) throws IOException {
        new Main().run();
    }

    void run() throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));

        int n = sc.nextInt();
        int arr[] = new int[n];
        int f = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            printAnswer(happyTicket(String.valueOf(arr[i])));

        }

    }

    public static String happyTicket(String str) {
        String[] arr = str.split("");
        int arrInt[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        return arrInt[0] + arrInt[1] + arrInt[2] >
                ((arrInt[3] + arrInt[4] + arrInt[5]) + 1) ? "YES" : "NO";

    }

    private static void printAnswer(String s) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.print(s);
        pw.close();
    }
}
