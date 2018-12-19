import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_1215 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        int[] arr = readNumbs(sc);
        int num = sc.nextInt();

        printAnswer(findNum(arr, num));
    }

    private static void printAnswer(int i) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.print(i);
        pw.close();
    }

    private static int findNum(int[] array, int x) {

        int result = array[0];

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - x) < Math.abs(result - x)
                    || Math.abs(array[i] - x) == Math.abs(result - x)
                    && array[i] < result) {

                result = array[i];
            }
        }
        return result;
    }

    private static int[] readNumbs(Scanner sc) {
        int length = sc.nextInt();

        int[] numbs = new int[length];
        for (int i = 0; i < length; i++) {
            numbs[i] = sc.nextInt();
        }
        return numbs;
    }
}
