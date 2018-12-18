import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_970 {
    public static void main(String[] argv) throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        if (a1 + a2 == a3 || a2 + a3 == a1 || a1 + a3 == a2) {
            pw.print("YES");
        } else pw.print("NO");

        pw.close();
    }
}

