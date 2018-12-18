import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_773 {
    public static void main(String[] argv) throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        int n = sc.nextInt();
        int i = sc.nextInt();

        pw.print(n * (n * i));
        pw.close();
    }
}
