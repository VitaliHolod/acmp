import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_907 {

    public static void main(String[] argv) throws IOException {
        new Task_907().run();
    }

    public void run() throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));

        int width = sc.nextInt();
        int height = sc.nextInt();
        int radius = sc.nextInt();

        printAnswer(width >= radius * 2 && height >= radius * 2 ? "YES" : "NO");
    }

    private static void printAnswer(String s) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.print(s);
        pw.close();
    }
}
