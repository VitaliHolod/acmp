import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] argv) throws IOException {
        new Main().run();
    }

    public void run() throws IOException {

        printAnswer(numbs());
    }

    private static int[] numbs() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
    }

    private static void printAnswer(int[] arr) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += " " + arr[i];
        }

        pw.print(s.trim());
        pw.close();
    }
}