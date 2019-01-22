import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_17 {

    public static void main(String[] args) throws IOException {

        new Task_17().run();
    }

    private static void run() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));

        int size = Integer.valueOf(sc.nextLine().trim());

        String initialData = sc.nextLine().trim();
        int indexFirstSpace = initialData.indexOf(" ");

        String data = initialData.substring(0, initialData.length() - indexFirstSpace - 1);

        StringBuilder sb = new StringBuilder();
        sb.append(data);
        sb.append(" ");
        sb.append(data);

        sb.delete(0, indexFirstSpace);

        int position = kmpMatcher(sb.toString(), data);

        String str = sb.toString().substring(0, position);
        int result = str.length() - str.replaceAll(" ", "").length();

        printAnswer(result);
    }

    private static void printAnswer(int result) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        
        pw.write(String.valueOf(result));
        pw.close();
    }

    private static int[] prefixFunction(String s) {
        int[] p = new int[s.length()];
        int k = 0;
        for (int i = 1; i < s.length(); i++) {
            while (k > 0 && s.charAt(k) != s.charAt(i))
                k = p[k - 1];
            if (s.charAt(k) == s.charAt(i))
                ++k;
            p[i] = k;
        }
        return p;
    }

    private static int kmpMatcher(String s, String pattern) {
        int m = pattern.length();
        if (m == 0)
            return 0;
        int[] p = prefixFunction(pattern);
        for (int i = 0, k = 0; i < s.length(); i++)
            for (; ; k = p[k - 1]) {
                if (pattern.charAt(k) == s.charAt(i)) {
                    if (++k == m)
                        return i + 1 - m;
                    break;
                }
                if (k == 0)
                    break;
            }
        return -1;
    }
}