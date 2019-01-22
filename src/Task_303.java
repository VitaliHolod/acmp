import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_303 {
    public static void main(String[] args) throws FileNotFoundException {
        Task_303.run();
    }

    private static void run() throws FileNotFoundException {

        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        String s = sc.next();

        int[] left = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            left[i] = left[i - 1] + (s.charAt(i - 1) - '0') * (i % 2 == 1 ? 1 : -1);
        }

        int[] right = new int[s.length()];
        for (int i = s.length() - 2; i > -1; i--) {
            right[i] = right[i + 1] + (s.charAt(i + 1) - '0') * (i % 2 == 1 ? -1 : 1);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int current = left[i] + right[i];
            if (current > max) {
                max = current;
            }
        }

        pw.write(Integer.toString(max));
        pw.close();
    }
}
