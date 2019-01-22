import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task_56 {
    public static void main(String[] argv) throws IOException {
        new Task_56().run();
    }

    void run() throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        int i, n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> friends = new ArrayList<>();
        ArrayList<String> mutual = new ArrayList<>();
        ArrayList<String> also = new ArrayList<>();

        for (i = 0; i < n; i++) {
            friends.add(sc.nextLine());
        }

        int m = sc.nextInt();
        if (n != 0) {
            sc.nextLine();
            for (i = 0; i < m; i++) {
                String curr = sc.nextLine();
                if (friends.contains(curr)) {
                    mutual.add(curr);
                } else {
                    also.add(curr);
                }
            }
        }

        Collections.sort(friends);
        Collections.sort(mutual);
        Collections.sort(also);

        printAnswer(pw, friends, mutual, also);
    }

    private void printAnswer(PrintWriter pw, ArrayList<String> friends, ArrayList<String> mutual, ArrayList<String> also) {
        int i;
        pw.print("Friends: ");
        for (i = 0; i < friends.size() - 1; i++) pw.print(friends.get(i) + ", ");
        if (!friends.isEmpty()) pw.print(friends.get(i));
        pw.println();

        pw.print("Mutual Friends: ");
        for (i = 0; i < mutual.size() - 1; i++) pw.print(mutual.get(i) + ", ");
        if (!mutual.isEmpty()) pw.print(mutual.get(i));
        pw.println();

        pw.print("Also Friend of: ");
        for (i = 0; i < also.size() - 1; i++) pw.print(also.get(i) + ", ");
        if (!also.isEmpty()) pw.print(also.get(i));
        pw.println();

        pw.close();
    }
}
