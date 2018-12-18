import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_297 {
    public static void main(String[] argv) throws IOException {
        new Task_297().run();
    }

    void run() throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        String s = sc.next();
        String[] arr = s.split("");

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("8")) {
                count = count + 2;
            }
            if (arr[i].contains("0") ||
                    arr[i].contains("6")|| arr[i].contains("9")) {
                count++;
            }
        }

        printAnswer(count);
    }

    private static void printAnswer(int i) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.print(i);
        pw.close();
    }


}
