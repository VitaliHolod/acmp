import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_692 {
    public static void main(String[] argv) throws IOException {

        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        int num = sc.nextInt();

        if ((num > 0) && ((num & (num - 1)) == 0))
            pw.print("YES");
        else
            pw.print("NO");

        pw.close();
    }
}
