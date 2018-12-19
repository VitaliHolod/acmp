import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_92 {
    public static void main(String[] argv) throws IOException {
        new Task_92().run();
    }

    public void run() throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));

        int n = sc.nextInt();
        int countPetia = (n / 2) / 3;
        int countSerg = (n / 2) / 3;
        int countKat = (n / 2) + countPetia;

        printAnswer(countPetia + " " + countKat + " " + countSerg);
    }

    private static void printAnswer(String count) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.print(count);
        pw.close();
    }
}