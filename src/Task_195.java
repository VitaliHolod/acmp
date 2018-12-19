import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_195 {
    public static void main(String[] argv) throws IOException {
        new Task_195().run();
    }

    public void run() throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = n * ((a * b)+(a * b));

        printAnswer(res);
    }

    private static void printAnswer(int count) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.print(count);
        pw.close();
    }
}

