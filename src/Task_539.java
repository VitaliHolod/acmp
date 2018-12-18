import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_539 {
    public static void main(String[] argv) throws IOException {
        new Task_539().run();
    }

    void run() throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));

        int n = sc.nextInt();

        if (n == 1) {
            printAnswer(0);
        }else
        printAnswer(n % 2 == 0 ? n / 2 : n);
    }

    private static void printAnswer(int i) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.print(i);
        pw.close();
    }


}
