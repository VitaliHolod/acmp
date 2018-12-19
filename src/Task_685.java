import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task_685 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();

        int arrSand[] = {a1, a2, a3};
        int arrCapacity[] = {b1, b2, b3};

        Arrays.sort(arrCapacity);
        Arrays.sort(arrSand);

        pw.print(arrSand[0] * arrCapacity[0] + arrSand[1] *
                arrCapacity[1] + arrSand[2] * arrCapacity[2]);
        pw.close();
    }
}
