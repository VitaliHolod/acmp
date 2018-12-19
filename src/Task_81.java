import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task_81 {
    public static void main(String[] argv) throws IOException {
        new Task_81().run();
    }

    public void run() throws IOException {

        int arr[] = numbs();
        Arrays.sort(arr);

        printAnswer(arr[0] + " " + arr[arr.length - 1]);
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