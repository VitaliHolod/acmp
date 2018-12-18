import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_754 {
    public static void main(String[] argv) throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        if ((m1 >= 94 && m1 <= 727) && (m2 >= 94 && m2 <= 727) && (m3 >= 94 && m3 <= 727)) {
            pw.print(Math.max(m1, Math.max(m2, m3)));
        } else pw.print("Error");

        pw.close();
    }
}
