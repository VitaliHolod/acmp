import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_264 {
    public static void main(String[] argv) throws IOException {
        new Task_297().run();
    }

    void run() throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        int arr[] = readNumbs(sc);


        printAnswer(getThaw(arr));
    }

    private static void printAnswer(int i) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.print(i);
        pw.close();
    }

    private static int[] readNumbs(Scanner sc) {

        int length = sc.nextInt();

        int[] numbs = new int[length];
        for (int i = 0; i < length; i++) {
            numbs[i] = sc.nextInt();
        }
        return numbs;
    }

    private static int getThaw(int[] arr) {
        int count = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1) {
                count = 0;
            } else count++;

            if (count > res) {
                res = count;
            }

        }
        return res;
    }
}