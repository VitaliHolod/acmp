import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_270 {
    public static void main(String[] argv) throws IOException {
        new Task_270().run();
    }

    public void run() throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        String s = sc.nextLine();
        String answer = "Error!";

        if (s.contains("_")) {
            Pattern p = Pattern.compile("^([a-z]+[_])+[a-z]+$");
            Matcher m = p.matcher(s);
            if (m.matches()) {
                String words[] = s.split("_");
                answer = words[0];
                for (int i = 1; i < words.length; i++) {
                    answer += (words[i].charAt(0) + "").toUpperCase();
                    answer += words[i].substring(1);
                }
            }
        } else {
            Pattern p = Pattern.compile("^[a-z]+([A-Z][a-z]*)*$");
            Matcher m = p.matcher(s);
            if (m.matches()) {
                answer = "";
                int i, pos1 = 0;
                for (i = 0; i < s.length(); i++) {
                    if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                        answer += s.substring(pos1, i) + "_";
                        pos1 = i;
                    }
                }
                answer += s.substring(pos1, i);
                answer = answer.toLowerCase();
            }
        }
        printAnswer(answer);
    }

    private void printAnswer(String answer) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.print(answer);
        pw.close();
    }
}

