import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_120 {
    public static void main(String[] argv) throws IOException {
        new Task_120().run();
    }

    void run() throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));

        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            matrix[i][0] = (i == 0) ? (matrix[0][0]) : (matrix[i - 1][0] + matrix[i][0]);

        }
        for (int i = 0; i < m; i++) {
            matrix[0][i] = (i == 0) ? (matrix[0][0]) : (matrix[0][i - 1] + matrix[0][i]);
        }

        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++)
                matrix[i][j] = (matrix[i - 1][j] < matrix[i][j - 1]) ?
                        (matrix[i - 1][j] + matrix[i][j]) :
                        (matrix[i][j - 1] + matrix[i][j]);

        printAnswer(matrix[n - 1][m - 1]);
    }

    private static void printAnswer(int i) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        pw.print(i);
        pw.close();
    }
}
